package io.happylrd.juno.core.app;

import java.util.WeakHashMap;

public class Configurator {

    private static final WeakHashMap<String, Object> JUNO_CONFIGS = new WeakHashMap<>();

    private Configurator() {
        JUNO_CONFIGS.put(ConfigType.CONFIG_READY.name(), false);
    }

    public static Configurator getInstance() {
        return Holder.INSTANCE;
    }

    final WeakHashMap<String, Object> getJunoConfigs() {
        return JUNO_CONFIGS;
    }

    private static class Holder {
        private static final Configurator INSTANCE = new Configurator();
    }

    public final void configure() {
        JUNO_CONFIGS.put(ConfigType.CONFIG_READY.name(), true);
    }

    public final Configurator withApiHost(String host) {
        JUNO_CONFIGS.put(ConfigType.API_HOST.name(), host);
        return this;
    }

    private void checkConfiguration() {
        final boolean isReady = (boolean) JUNO_CONFIGS.get(ConfigType.CONFIG_READY.name());
        if (!isReady) {
            throw new RuntimeException("Configuration is not ready,call configure");
        }
    }

    @SuppressWarnings("unchecked")
    final <T> T getConfiguration(Enum<ConfigType> key) {
        checkConfiguration();
        return (T) JUNO_CONFIGS.get(key.name());
    }
}
