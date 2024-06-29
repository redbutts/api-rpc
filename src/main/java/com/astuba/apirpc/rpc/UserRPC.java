package com.astuba.apirpc.rpc;

import com.astuba.apirpc.model.User;

public interface UserRPC {
    User getUser(String accessKey);
}
