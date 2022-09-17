package com.digitalocean.api.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The name of a custom image's distribution. Currently, the valid values are `Arch Linux`, `CentOS`, `CoreOS`,
 * `Debian`, `Fedora`, `Fedora Atomic`, `FreeBSD`, `Gentoo`, `openSUSE`, `RancherOS`, `Rocky Linux`, `Ubuntu`, and
 * `Unknown`. Any other value will be accepted but ignored, and `Unknown` will be used in its place.
 */
public final class Distribution extends ExpandableStringEnum<Distribution> {
    /** Static value Arch Linux for Distribution. */
    public static final Distribution ARCH_LINUX = fromString("Arch Linux");

    /** Static value CentOS for Distribution. */
    public static final Distribution CENT_OS = fromString("CentOS");

    /** Static value CoreOS for Distribution. */
    public static final Distribution CORE_OS = fromString("CoreOS");

    /** Static value Debian for Distribution. */
    public static final Distribution DEBIAN = fromString("Debian");

    /** Static value Fedora for Distribution. */
    public static final Distribution FEDORA = fromString("Fedora");

    /** Static value Fedora Atomic for Distribution. */
    public static final Distribution FEDORA_ATOMIC = fromString("Fedora Atomic");

    /** Static value FreeBSD for Distribution. */
    public static final Distribution FREE_BSD = fromString("FreeBSD");

    /** Static value Gentoo for Distribution. */
    public static final Distribution GENTOO = fromString("Gentoo");

    /** Static value openSUSE for Distribution. */
    public static final Distribution OPEN_SUSE = fromString("openSUSE");

    /** Static value RancherOS for Distribution. */
    public static final Distribution RANCHER_OS = fromString("RancherOS");

    /** Static value Rocky Linux for Distribution. */
    public static final Distribution ROCKY_LINUX = fromString("Rocky Linux");

    /** Static value Ubuntu for Distribution. */
    public static final Distribution UBUNTU = fromString("Ubuntu");

    /** Static value Unknown for Distribution. */
    public static final Distribution UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a Distribution from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Distribution.
     */
    @JsonCreator
    public static Distribution fromString(String name) {
        return fromString(name, Distribution.class);
    }

    /**
     * Gets known Distribution values.
     *
     * @return known Distribution values.
     */
    public static Collection<Distribution> values() {
        return values(Distribution.class);
    }
}
