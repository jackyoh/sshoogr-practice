options.trustUnknownHosts = true

remoteSession {
  url = 'root:123456@localhost:22'
  scp {
    from { localFile "./example1.groovy" }  
    into { remoteFile '/tmp/example1.groovy'}
  }
}
