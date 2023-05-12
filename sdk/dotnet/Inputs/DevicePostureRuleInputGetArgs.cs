// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class DevicePostureRuleInputGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("checkDisks")]
        private InputList<string>? _checkDisks;

        /// <summary>
        /// Specific volume(s) to check for encryption.
        /// </summary>
        public InputList<string> CheckDisks
        {
            get => _checkDisks ?? (_checkDisks = new InputList<string>());
            set => _checkDisks = value;
        }

        /// <summary>
        /// The workspace one device compliance status. Available values: `compliant`, `noncompliant`.
        /// </summary>
        [Input("complianceStatus")]
        public Input<string>? ComplianceStatus { get; set; }

        /// <summary>
        /// The workspace one connection id.
        /// </summary>
        [Input("connectionId")]
        public Input<string>? ConnectionId { get; set; }

        /// <summary>
        /// The domain that the client must join.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// True if the firewall must be enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Checks if the file should exist.
        /// </summary>
        [Input("exists")]
        public Input<bool>? Exists { get; set; }

        /// <summary>
        /// The Teams List id.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The version comparison operator. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
        /// </summary>
        [Input("operator")]
        public Input<string>? Operator { get; set; }

        /// <summary>
        /// OS signal score from Crowdstrike. Value must be between 1 and 100.
        /// </summary>
        [Input("os")]
        public Input<string>? Os { get; set; }

        /// <summary>
        /// The operating system excluding version information.
        /// </summary>
        [Input("osDistroName")]
        public Input<string>? OsDistroName { get; set; }

        /// <summary>
        /// The operating system version excluding OS name information or release name.
        /// </summary>
        [Input("osDistroRevision")]
        public Input<string>? OsDistroRevision { get; set; }

        /// <summary>
        /// Overall ZTA score from Crowdstrike. Value must be between 1 and 100.
        /// </summary>
        [Input("overall")]
        public Input<string>? Overall { get; set; }

        /// <summary>
        /// The path to the file.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// True if all drives must be encrypted.
        /// </summary>
        [Input("requireAll")]
        public Input<bool>? RequireAll { get; set; }

        /// <summary>
        /// Checks if the application should be running.
        /// </summary>
        [Input("running")]
        public Input<bool>? Running { get; set; }

        /// <summary>
        /// Sensor signal score from Crowdstrike. Value must be between 1 and 100.
        /// </summary>
        [Input("sensorConfig")]
        public Input<string>? SensorConfig { get; set; }

        /// <summary>
        /// The sha256 hash of the file.
        /// </summary>
        [Input("sha256")]
        public Input<string>? Sha256 { get; set; }

        /// <summary>
        /// The thumbprint of the file certificate.
        /// </summary>
        [Input("thumbprint")]
        public Input<string>? Thumbprint { get; set; }

        /// <summary>
        /// The operating system semantic version.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// The version comparison operator for crowdstrike. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
        /// </summary>
        [Input("versionOperator")]
        public Input<string>? VersionOperator { get; set; }

        public DevicePostureRuleInputGetArgs()
        {
        }
        public static new DevicePostureRuleInputGetArgs Empty => new DevicePostureRuleInputGetArgs();
    }
}
