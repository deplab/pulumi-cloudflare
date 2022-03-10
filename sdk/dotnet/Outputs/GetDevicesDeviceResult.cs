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
    public sealed class GetDevicesDeviceResult
    {
        /// <summary>
        /// When the device was created.
        /// </summary>
        public readonly string? Created;
        /// <summary>
        /// The type of the device.
        /// </summary>
        public readonly string? DeviceType;
        /// <summary>
        /// Device ID.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// IPv4 or IPv6 address.
        /// </summary>
        public readonly string? Ip;
        /// <summary>
        /// The device's public key.
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// When the device was last seen.
        /// </summary>
        public readonly string? LastSeen;
        /// <summary>
        /// The device model name.
        /// </summary>
        public readonly string? Model;
        /// <summary>
        /// The device name.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The operating system version.
        /// </summary>
        public readonly string? OsVersion;
        /// <summary>
        /// When the device was updated.
        /// </summary>
        public readonly string? Updated;
        /// <summary>
        /// User's email.
        /// </summary>
        public readonly string? UserEmail;
        /// <summary>
        /// User's ID.
        /// </summary>
        public readonly string? UserId;
        /// <summary>
        /// User's Name.
        /// </summary>
        public readonly string? UserName;
        /// <summary>
        /// The WARP client version.
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private GetDevicesDeviceResult(
            string? created,

            string? deviceType,

            string? id,

            string? ip,

            string? key,

            string? lastSeen,

            string? model,

            string? name,

            string? osVersion,

            string? updated,

            string? userEmail,

            string? userId,

            string? userName,

            string? version)
        {
            Created = created;
            DeviceType = deviceType;
            Id = id;
            Ip = ip;
            Key = key;
            LastSeen = lastSeen;
            Model = model;
            Name = name;
            OsVersion = osVersion;
            Updated = updated;
            UserEmail = userEmail;
            UserId = userId;
            UserName = userName;
            Version = version;
        }
    }
}