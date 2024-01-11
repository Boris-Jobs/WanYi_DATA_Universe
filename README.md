# WanYi_DATA_Universe
This repository contains the python codes which request the data from bytedance database and some involved git codes and commands to make a legendary dashboard for our sales and advertisements.

Clone by SSH:
```shell
git clone git@github.com:Boris-Jobs/WanYi_DATA_Universe.git
```

Clone by https:
```shell
git clone https://github.com/你的用户名/仓库名.git
```

Refine, updata and fix:
```shell
git remote add origin git@github.com:Boris-Jobs/WanYi_DATA_Universe.git
git pull origin main

# Update feature

git add .
git commit -m "Update feature"
git push origin "my branch"
```

notes:
```shell
git branch -m master main # change branch name from master to main

# every time you have a new device:
ls -al ~/.ssh # check the keys
ssh-keygen -t rsa -b 4096 -C "your_email@example.com" # generate a ssh-key
eval $(ssh-agent -s) # add ssh-key to ssh-agent
ssh-add ~/.ssh/id_rsa
cat ~/.ssh/id_rsa.pub # copy these shit to github ssh settings

```
