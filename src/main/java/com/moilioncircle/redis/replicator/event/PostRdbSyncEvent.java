/*
 * Copyright 2016-2018 Leon Chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moilioncircle.redis.replicator.event;

/**
 * @author Leon Chen
 * @since 3.0.0
 */
public class PostRdbSyncEvent extends AbstractEvent {

    private static final long serialVersionUID = 1L;

    private long checksum;
    
    public PostRdbSyncEvent() {
    }
    
    public PostRdbSyncEvent(long checksum) {
        this.checksum = checksum;
    }

    public long getChecksum() {
        return checksum;
    }

    public void setChecksum(long checksum) {
        this.checksum = checksum;
    }
}
