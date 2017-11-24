options.trustUnknownHosts = true

remoteSession("user1:123456@localhost:22") {
  exec(command: 'ls -l')

  //遠端建立一個檔案
  remoteFile('/tmp/test11').text = "enabled=true"
}
