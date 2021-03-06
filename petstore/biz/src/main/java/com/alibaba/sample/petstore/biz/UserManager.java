/*
 * Copyright (c) 2002-2012 Alibaba Group Holding Limited.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.sample.petstore.biz;

import com.alibaba.sample.petstore.dal.dataobject.User;

/**
 * 有关用户的操作。
 *
 * @author Michael Zhou
 */
public interface UserManager {
    /**
     * 登录用户，如果用户名和密码正确，则返回相应的用户信息。
     *
     * @param userId   用户名
     * @param password 密码
     * @return 用户信息，如果用户名或密码不正确，则返回<code>null</code>
     */
    User login(String userId, String password);

    /**
     * 注册用户。
     *
     * @param user 用户对象
     */
    void register(User user) throws DuplicatedUserException;

    /**
     * 更新用户的信息。
     *
     * @param user 用户对象
     */
    void update(User user);

    /**
     * 取得指定id的用户。
     *
     * @param userId 用户id
     * @return 指定id的用户
     */
    User getUser(String userId);
}
