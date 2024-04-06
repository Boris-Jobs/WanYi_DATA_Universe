Get-ChildItem | Select-Object Name, FullName, LastWriteTime, Length, @{Name="ParentFolder"; Expression={$_.Parent.FullName}}
