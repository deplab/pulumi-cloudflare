// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DevicePostureRuleInput {
    /**
     * @return The number of active threats from SentinelOne.
     * 
     */
    private @Nullable Integer activeThreats;
    /**
     * @return The UUID of a Cloudflare managed certificate.
     * 
     */
    private @Nullable String certificateId;
    /**
     * @return Specific volume(s) to check for encryption.
     * 
     */
    private @Nullable List<String> checkDisks;
    /**
     * @return The common name for a certificate.
     * 
     */
    private @Nullable String cn;
    /**
     * @return The workspace one device compliance status. Available values: `compliant`, `noncompliant`.
     * 
     */
    private @Nullable String complianceStatus;
    /**
     * @return The workspace one connection id.
     * 
     */
    private @Nullable String connectionId;
    /**
     * @return The count comparison operator for kolide. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
     * 
     */
    private @Nullable String countOperator;
    /**
     * @return The domain that the client must join.
     * 
     */
    private @Nullable String domain;
    /**
     * @return The datetime a device last seen in RFC 3339 format from Tanium.
     * 
     */
    private @Nullable String eidLastSeen;
    /**
     * @return True if the firewall must be enabled.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Checks if the file should exist.
     * 
     */
    private @Nullable Boolean exists;
    /**
     * @return The Teams List id.
     * 
     */
    private @Nullable String id;
    /**
     * @return True if SentinelOne device is infected.
     * 
     */
    private @Nullable Boolean infected;
    /**
     * @return True if SentinelOne device is active.
     * 
     */
    private @Nullable Boolean isActive;
    /**
     * @return The number of issues for kolide.
     * 
     */
    private @Nullable String issueCount;
    /**
     * @return The network status from SentinelOne. Available values: `connected`, `disconnected`, `disconnecting`, `connecting`.
     * 
     */
    private @Nullable String networkStatus;
    /**
     * @return The version comparison operator. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
     * 
     */
    private @Nullable String operator;
    /**
     * @return OS signal score from Crowdstrike. Value must be between 1 and 100.
     * 
     */
    private @Nullable String os;
    /**
     * @return The operating system excluding version information.
     * 
     */
    private @Nullable String osDistroName;
    /**
     * @return The operating system version excluding OS name information or release name.
     * 
     */
    private @Nullable String osDistroRevision;
    /**
     * @return Overall ZTA score from Crowdstrike. Value must be between 1 and 100.
     * 
     */
    private @Nullable String overall;
    /**
     * @return The path to the file.
     * 
     */
    private @Nullable String path;
    /**
     * @return True if all drives must be encrypted.
     * 
     */
    private @Nullable Boolean requireAll;
    /**
     * @return The risk level from Tanium. Available values: `low`, `medium`, `high`, `critical`.
     * 
     */
    private @Nullable String riskLevel;
    /**
     * @return Checks if the application should be running.
     * 
     */
    private @Nullable Boolean running;
    /**
     * @return Sensor signal score from Crowdstrike. Value must be between 1 and 100.
     * 
     */
    private @Nullable String sensorConfig;
    /**
     * @return The sha256 hash of the file.
     * 
     */
    private @Nullable String sha256;
    /**
     * @return The thumbprint of the file certificate.
     * 
     */
    private @Nullable String thumbprint;
    /**
     * @return The total score from Tanium.
     * 
     */
    private @Nullable Integer totalScore;
    /**
     * @return The operating system semantic version.
     * 
     */
    private @Nullable String version;
    /**
     * @return The version comparison operator for crowdstrike. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
     * 
     */
    private @Nullable String versionOperator;

    private DevicePostureRuleInput() {}
    /**
     * @return The number of active threats from SentinelOne.
     * 
     */
    public Optional<Integer> activeThreats() {
        return Optional.ofNullable(this.activeThreats);
    }
    /**
     * @return The UUID of a Cloudflare managed certificate.
     * 
     */
    public Optional<String> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }
    /**
     * @return Specific volume(s) to check for encryption.
     * 
     */
    public List<String> checkDisks() {
        return this.checkDisks == null ? List.of() : this.checkDisks;
    }
    /**
     * @return The common name for a certificate.
     * 
     */
    public Optional<String> cn() {
        return Optional.ofNullable(this.cn);
    }
    /**
     * @return The workspace one device compliance status. Available values: `compliant`, `noncompliant`.
     * 
     */
    public Optional<String> complianceStatus() {
        return Optional.ofNullable(this.complianceStatus);
    }
    /**
     * @return The workspace one connection id.
     * 
     */
    public Optional<String> connectionId() {
        return Optional.ofNullable(this.connectionId);
    }
    /**
     * @return The count comparison operator for kolide. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
     * 
     */
    public Optional<String> countOperator() {
        return Optional.ofNullable(this.countOperator);
    }
    /**
     * @return The domain that the client must join.
     * 
     */
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * @return The datetime a device last seen in RFC 3339 format from Tanium.
     * 
     */
    public Optional<String> eidLastSeen() {
        return Optional.ofNullable(this.eidLastSeen);
    }
    /**
     * @return True if the firewall must be enabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Checks if the file should exist.
     * 
     */
    public Optional<Boolean> exists() {
        return Optional.ofNullable(this.exists);
    }
    /**
     * @return The Teams List id.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return True if SentinelOne device is infected.
     * 
     */
    public Optional<Boolean> infected() {
        return Optional.ofNullable(this.infected);
    }
    /**
     * @return True if SentinelOne device is active.
     * 
     */
    public Optional<Boolean> isActive() {
        return Optional.ofNullable(this.isActive);
    }
    /**
     * @return The number of issues for kolide.
     * 
     */
    public Optional<String> issueCount() {
        return Optional.ofNullable(this.issueCount);
    }
    /**
     * @return The network status from SentinelOne. Available values: `connected`, `disconnected`, `disconnecting`, `connecting`.
     * 
     */
    public Optional<String> networkStatus() {
        return Optional.ofNullable(this.networkStatus);
    }
    /**
     * @return The version comparison operator. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return OS signal score from Crowdstrike. Value must be between 1 and 100.
     * 
     */
    public Optional<String> os() {
        return Optional.ofNullable(this.os);
    }
    /**
     * @return The operating system excluding version information.
     * 
     */
    public Optional<String> osDistroName() {
        return Optional.ofNullable(this.osDistroName);
    }
    /**
     * @return The operating system version excluding OS name information or release name.
     * 
     */
    public Optional<String> osDistroRevision() {
        return Optional.ofNullable(this.osDistroRevision);
    }
    /**
     * @return Overall ZTA score from Crowdstrike. Value must be between 1 and 100.
     * 
     */
    public Optional<String> overall() {
        return Optional.ofNullable(this.overall);
    }
    /**
     * @return The path to the file.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return True if all drives must be encrypted.
     * 
     */
    public Optional<Boolean> requireAll() {
        return Optional.ofNullable(this.requireAll);
    }
    /**
     * @return The risk level from Tanium. Available values: `low`, `medium`, `high`, `critical`.
     * 
     */
    public Optional<String> riskLevel() {
        return Optional.ofNullable(this.riskLevel);
    }
    /**
     * @return Checks if the application should be running.
     * 
     */
    public Optional<Boolean> running() {
        return Optional.ofNullable(this.running);
    }
    /**
     * @return Sensor signal score from Crowdstrike. Value must be between 1 and 100.
     * 
     */
    public Optional<String> sensorConfig() {
        return Optional.ofNullable(this.sensorConfig);
    }
    /**
     * @return The sha256 hash of the file.
     * 
     */
    public Optional<String> sha256() {
        return Optional.ofNullable(this.sha256);
    }
    /**
     * @return The thumbprint of the file certificate.
     * 
     */
    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }
    /**
     * @return The total score from Tanium.
     * 
     */
    public Optional<Integer> totalScore() {
        return Optional.ofNullable(this.totalScore);
    }
    /**
     * @return The operating system semantic version.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }
    /**
     * @return The version comparison operator for crowdstrike. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
     * 
     */
    public Optional<String> versionOperator() {
        return Optional.ofNullable(this.versionOperator);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePostureRuleInput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer activeThreats;
        private @Nullable String certificateId;
        private @Nullable List<String> checkDisks;
        private @Nullable String cn;
        private @Nullable String complianceStatus;
        private @Nullable String connectionId;
        private @Nullable String countOperator;
        private @Nullable String domain;
        private @Nullable String eidLastSeen;
        private @Nullable Boolean enabled;
        private @Nullable Boolean exists;
        private @Nullable String id;
        private @Nullable Boolean infected;
        private @Nullable Boolean isActive;
        private @Nullable String issueCount;
        private @Nullable String networkStatus;
        private @Nullable String operator;
        private @Nullable String os;
        private @Nullable String osDistroName;
        private @Nullable String osDistroRevision;
        private @Nullable String overall;
        private @Nullable String path;
        private @Nullable Boolean requireAll;
        private @Nullable String riskLevel;
        private @Nullable Boolean running;
        private @Nullable String sensorConfig;
        private @Nullable String sha256;
        private @Nullable String thumbprint;
        private @Nullable Integer totalScore;
        private @Nullable String version;
        private @Nullable String versionOperator;
        public Builder() {}
        public Builder(DevicePostureRuleInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeThreats = defaults.activeThreats;
    	      this.certificateId = defaults.certificateId;
    	      this.checkDisks = defaults.checkDisks;
    	      this.cn = defaults.cn;
    	      this.complianceStatus = defaults.complianceStatus;
    	      this.connectionId = defaults.connectionId;
    	      this.countOperator = defaults.countOperator;
    	      this.domain = defaults.domain;
    	      this.eidLastSeen = defaults.eidLastSeen;
    	      this.enabled = defaults.enabled;
    	      this.exists = defaults.exists;
    	      this.id = defaults.id;
    	      this.infected = defaults.infected;
    	      this.isActive = defaults.isActive;
    	      this.issueCount = defaults.issueCount;
    	      this.networkStatus = defaults.networkStatus;
    	      this.operator = defaults.operator;
    	      this.os = defaults.os;
    	      this.osDistroName = defaults.osDistroName;
    	      this.osDistroRevision = defaults.osDistroRevision;
    	      this.overall = defaults.overall;
    	      this.path = defaults.path;
    	      this.requireAll = defaults.requireAll;
    	      this.riskLevel = defaults.riskLevel;
    	      this.running = defaults.running;
    	      this.sensorConfig = defaults.sensorConfig;
    	      this.sha256 = defaults.sha256;
    	      this.thumbprint = defaults.thumbprint;
    	      this.totalScore = defaults.totalScore;
    	      this.version = defaults.version;
    	      this.versionOperator = defaults.versionOperator;
        }

        @CustomType.Setter
        public Builder activeThreats(@Nullable Integer activeThreats) {
            this.activeThreats = activeThreats;
            return this;
        }
        @CustomType.Setter
        public Builder certificateId(@Nullable String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        @CustomType.Setter
        public Builder checkDisks(@Nullable List<String> checkDisks) {
            this.checkDisks = checkDisks;
            return this;
        }
        public Builder checkDisks(String... checkDisks) {
            return checkDisks(List.of(checkDisks));
        }
        @CustomType.Setter
        public Builder cn(@Nullable String cn) {
            this.cn = cn;
            return this;
        }
        @CustomType.Setter
        public Builder complianceStatus(@Nullable String complianceStatus) {
            this.complianceStatus = complianceStatus;
            return this;
        }
        @CustomType.Setter
        public Builder connectionId(@Nullable String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        @CustomType.Setter
        public Builder countOperator(@Nullable String countOperator) {
            this.countOperator = countOperator;
            return this;
        }
        @CustomType.Setter
        public Builder domain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder eidLastSeen(@Nullable String eidLastSeen) {
            this.eidLastSeen = eidLastSeen;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder exists(@Nullable Boolean exists) {
            this.exists = exists;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder infected(@Nullable Boolean infected) {
            this.infected = infected;
            return this;
        }
        @CustomType.Setter
        public Builder isActive(@Nullable Boolean isActive) {
            this.isActive = isActive;
            return this;
        }
        @CustomType.Setter
        public Builder issueCount(@Nullable String issueCount) {
            this.issueCount = issueCount;
            return this;
        }
        @CustomType.Setter
        public Builder networkStatus(@Nullable String networkStatus) {
            this.networkStatus = networkStatus;
            return this;
        }
        @CustomType.Setter
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder os(@Nullable String os) {
            this.os = os;
            return this;
        }
        @CustomType.Setter
        public Builder osDistroName(@Nullable String osDistroName) {
            this.osDistroName = osDistroName;
            return this;
        }
        @CustomType.Setter
        public Builder osDistroRevision(@Nullable String osDistroRevision) {
            this.osDistroRevision = osDistroRevision;
            return this;
        }
        @CustomType.Setter
        public Builder overall(@Nullable String overall) {
            this.overall = overall;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder requireAll(@Nullable Boolean requireAll) {
            this.requireAll = requireAll;
            return this;
        }
        @CustomType.Setter
        public Builder riskLevel(@Nullable String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        @CustomType.Setter
        public Builder running(@Nullable Boolean running) {
            this.running = running;
            return this;
        }
        @CustomType.Setter
        public Builder sensorConfig(@Nullable String sensorConfig) {
            this.sensorConfig = sensorConfig;
            return this;
        }
        @CustomType.Setter
        public Builder sha256(@Nullable String sha256) {
            this.sha256 = sha256;
            return this;
        }
        @CustomType.Setter
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        @CustomType.Setter
        public Builder totalScore(@Nullable Integer totalScore) {
            this.totalScore = totalScore;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        @CustomType.Setter
        public Builder versionOperator(@Nullable String versionOperator) {
            this.versionOperator = versionOperator;
            return this;
        }
        public DevicePostureRuleInput build() {
            final var o = new DevicePostureRuleInput();
            o.activeThreats = activeThreats;
            o.certificateId = certificateId;
            o.checkDisks = checkDisks;
            o.cn = cn;
            o.complianceStatus = complianceStatus;
            o.connectionId = connectionId;
            o.countOperator = countOperator;
            o.domain = domain;
            o.eidLastSeen = eidLastSeen;
            o.enabled = enabled;
            o.exists = exists;
            o.id = id;
            o.infected = infected;
            o.isActive = isActive;
            o.issueCount = issueCount;
            o.networkStatus = networkStatus;
            o.operator = operator;
            o.os = os;
            o.osDistroName = osDistroName;
            o.osDistroRevision = osDistroRevision;
            o.overall = overall;
            o.path = path;
            o.requireAll = requireAll;
            o.riskLevel = riskLevel;
            o.running = running;
            o.sensorConfig = sensorConfig;
            o.sha256 = sha256;
            o.thumbprint = thumbprint;
            o.totalScore = totalScore;
            o.version = version;
            o.versionOperator = versionOperator;
            return o;
        }
    }
}
