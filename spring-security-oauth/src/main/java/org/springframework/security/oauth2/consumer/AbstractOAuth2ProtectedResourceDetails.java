package org.springframework.security.oauth2.consumer;

import java.util.List;

/**
 * @author Ryan Heaton
 */
public abstract class AbstractOAuth2ProtectedResourceDetails implements OAuth2ProtectedResourceDetails {

  private String id;
  private String clientId;
  private String accessTokenUri;
  private boolean scoped;
  private List<String> scope;
  private boolean secretRequired;
  private String clientSecret;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public String getAccessTokenUri() {
    return accessTokenUri;
  }

  public void setAccessTokenUri(String accessTokenUri) {
    this.accessTokenUri = accessTokenUri;
  }

  public boolean isScoped() {
    return scoped;
  }

  public void setScoped(boolean scoped) {
    this.scoped = scoped;
  }

  public List<String> getScope() {
    return scope;
  }

  public void setScope(List<String> scope) {
    this.scope = scope;
  }

  public boolean isSecretRequired() {
    return false;
  }

  public String getClientSecret() {
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AbstractOAuth2ProtectedResourceDetails)) {
      return false;
    }

    AbstractOAuth2ProtectedResourceDetails that = (AbstractOAuth2ProtectedResourceDetails) o;
    return !(id != null ? !id.equals(that.id) : that.id != null);

  }

  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }
}