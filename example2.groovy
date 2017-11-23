options.trustUnknownHosts = true

remoteSession {
  url = 'root:123456@server-a1:22'
  exec(command: 'ls -l')

}
