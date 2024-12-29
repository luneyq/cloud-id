/**
 * Copyright 2015-2016 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.luneyq.id.snowflake;

/**
 * Purpose.
 *
 * A description of why this class exists.  
 *   For what reason was it written?  
 *   Which jobs does it perform?
 * {@code DataAccessException} using 
 * @author how
 * @date 17/1/13
 */
public class BasicEntityId {
    private long timestamp;
    private long centerId;
    private long seqId;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getCenterId() {
        return centerId;
    }

    public void setCenterId(long centerId) {
        this.centerId = centerId;
    }

    public long getSeqId() {
        return seqId;
    }

    public void setSeqId(long seqId) {
        this.seqId = seqId;
    }
}
