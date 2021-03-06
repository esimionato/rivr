/*
 * Copyright (c) 2013 Nu Echo Inc. All rights reserved.
 */

package com.nuecho.rivr.voicexml.servlet;

import com.nuecho.rivr.voicexml.turn.last.*;

/**
 * Error handler generating an empty &lt;exit&gt; element.
 * 
 * @author Nu Echo Inc.
 */
public class DefaultErrorHandler implements VoiceXmlErrorHandler {
    @Override
    public VoiceXmlLastTurn handleError(Throwable error) {
        return new Exit("error");
    }
}
