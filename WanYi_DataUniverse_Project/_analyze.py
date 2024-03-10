import json
import pandas as pd
import matplotlib.pyplot as plt

# Load JSON data
with open("GET_live_data_daily.json", "r", encoding="utf-8") as f:
    data = json.load(f)

# Extracting data for analysis
tcl_data = data["TCL空调"]
dates = sorted(tcl_data.keys())

# Creating a DataFrame for analysis
df = pd.DataFrame({date: tcl_data[date]["data"] for date in dates}).transpose()

# Convert monetary values to actual amounts
monetary_columns = [
    "ad_live_pay_order_gmv_avg",
    "live_pay_order_gmv_avg",
    "luban_live_pay_order_gmv",
    "luban_live_prepay_order_gmv",
    "qualification_stat_cost",
    "stat_cost",
    "total_live_gift_amount",
]
df[monetary_columns] /= 1000  # converting to actual amounts

# Analyze data
analysis_result = df.describe()

# Visualize data
plt.figure(figsize=(12, 8))

# Example: Bar chart for click counts
plt.subplot(2, 2, 1)
df["click_cnt"].plot(kind="bar", title="Click Counts")

# Example: Line chart for total live watch counts
plt.subplot(2, 2, 2)
df["total_live_watch_cnt"].plot(kind="line", marker="o", title="Total Live Watch Counts")

# Save figures
plt.tight_layout()
plt.savefig("charts.png")

# Save analysis result to a text file
with open("_analysis_result.txt", "w") as txt_file:
    txt_file.write(analysis_result.to_string())

# Show the plots
plt.show()
