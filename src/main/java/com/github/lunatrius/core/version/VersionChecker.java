package com.github.lunatrius.core.version;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.versioning.ArtifactVersion;
import cpw.mods.fml.common.versioning.DefaultArtifactVersion;

public class VersionChecker {

    public static final String RECOMMENDED_FORGE = "\n---\nRecommended Forge: %s";
    public static final String VERCHECKAPI_URL = "http://mc.lunatri.us/json?latest=1&mc=%s&v=%d";
    public static final int VERCHECKAPI_VER = 2;

    public static final String VERSION = "%s -> %s";
    public static final String UPDATEAVAILABLE = "\nUpdate is available (%s -> %s)!";
    public static final String UPTODATE = "\nUp to date!";

    public static final String UPDATEAVAILABLECON = "Update is available for %s (%s -> %s)!";
    public static final String UPTODATECON = "%s is up to date!";
    public static final String FUTURECON = "Is %s from the future?";

    public static final String DYNIOUS_VERSIONCHECKER_MODID = "VersionChecker";
    public static final String UPDATE_URL = "https://mods.io/mods?author=Lunatrius";

    private static final Map<String, String> OUTDATED_MODS = new HashMap<String, String>();

    @Deprecated
    public static void registerMod(ModMetadata modMetadata) {}

    public static void registerMod(ModMetadata modMetadata, String forgeVersion) {}

    public static Set<Map.Entry<String, String>> getOutdatedMods() {
        return OUTDATED_MODS.entrySet();
    }

    public static void setDone(boolean isDone) {

    }

    public static boolean isDone() {
        return true;
    }

    public static void startVersionCheck() {}

    private static void addOutdatedMod(ModMetadata metadata, ArtifactVersion versionLocal,
        DefaultArtifactVersion versionRemote, String changeLog) {}
}
