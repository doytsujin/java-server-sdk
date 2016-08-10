package com.launchdarkly.client;

class IdentifyEvent extends Event {

  IdentifyEvent(LDUser user) {
    super("identify", user.getKeyAsString(), user);
  }
}
