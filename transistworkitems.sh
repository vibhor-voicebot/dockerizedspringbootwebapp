#!/bin/bash

echo "${Build.SourceVersionMessage}"
idvalue=`echo "{Build.SourceVersionMessage}" | awk -F"#" '{print $2}'`
echo "${idvalue}"

echo -n 2meijxrdwcazipaluawgwnifojj4fiee3qolgipd2qwlg7lb2fqa | az devops login --organization https://dev.azure.com/GenpactSimulator
az devops configure --defaults organization=https://dev.azure.com/GenpactSimulator project=iacautomation
az boards work-item update --id ${idvalue} --assigned-to "Vibhor Saxena" --description ${2} --state ${1}

echo "updated workitem state and transited to required board column.."
