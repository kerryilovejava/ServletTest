package com.cmcc.ict.flux.interfaces.service;

public class IfAPServicePortTypeProxy implements com.cmcc.ict.flux.interfaces.service.IfAPServicePortType {
  private String _endpoint = null;
  private com.cmcc.ict.flux.interfaces.service.IfAPServicePortType ifAPServicePortType = null;
  
  public IfAPServicePortTypeProxy() {
    _initIfAPServicePortTypeProxy();
  }
  
  public IfAPServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initIfAPServicePortTypeProxy();
  }
  
  private void _initIfAPServicePortTypeProxy() {
    try {
      ifAPServicePortType = (new com.cmcc.ict.flux.interfaces.service.IfAPServiceLocator()).getIfAPServicePort();
      if (ifAPServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ifAPServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ifAPServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ifAPServicePortType != null)
      ((javax.xml.rpc.Stub)ifAPServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.cmcc.ict.flux.interfaces.service.IfAPServicePortType getIfAPServicePortType() {
    if (ifAPServicePortType == null)
      _initIfAPServicePortTypeProxy();
    return ifAPServicePortType;
  }
  
  public java.lang.String queryOrderInfo(java.lang.String arg0) throws java.rmi.RemoteException{
    if (ifAPServicePortType == null)
      _initIfAPServicePortTypeProxy();
    return ifAPServicePortType.queryOrderInfo(arg0);
  }
  
  public java.lang.String presentPhoneVolume(java.lang.String arg0) throws java.rmi.RemoteException{
    if (ifAPServicePortType == null)
      _initIfAPServicePortTypeProxy();
    return ifAPServicePortType.presentPhoneVolume(arg0);
  }
  
  public java.lang.String queryCorpAccount(java.lang.String arg0) throws java.rmi.RemoteException{
    if (ifAPServicePortType == null)
      _initIfAPServicePortTypeProxy();
    return ifAPServicePortType.queryCorpAccount(arg0);
  }
  
  
}