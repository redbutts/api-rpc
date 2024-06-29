package com.astuba.apirpc.rpc;

import com.astuba.apirpc.model.InterfaceInfo;

public interface InterfaceInfoRPC {
    InterfaceInfo getInterfaceInfo(String url, String method);
}
