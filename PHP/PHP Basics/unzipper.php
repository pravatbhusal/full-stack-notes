<?php
$zip = new ZipArchive();

if($zip->open('test.zip')==TRUE) { //unzips the test.zip file
    $address="unzipped/"; //unzips it to the /unzipped/ folder
    $zip->extractTo($address);
    $zip->close();
    echo 'Successfully uploaded the file as a folder!';
}
else{
    echo 'Failued to upload the file as a folder...';
    }
?>