// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class TeamsAccountAntivirus
    {
        /// <summary>
        /// Scan on file download.
        /// </summary>
        public readonly bool EnabledDownloadPhase;
        /// <summary>
        /// Scan on file upload.
        /// </summary>
        public readonly bool EnabledUploadPhase;
        /// <summary>
        /// Block requests for files that cannot be scanned.
        /// </summary>
        public readonly bool FailClosed;

        [OutputConstructor]
        private TeamsAccountAntivirus(
            bool enabledDownloadPhase,

            bool enabledUploadPhase,

            bool failClosed)
        {
            EnabledDownloadPhase = enabledDownloadPhase;
            EnabledUploadPhase = enabledUploadPhase;
            FailClosed = failClosed;
        }
    }
}
