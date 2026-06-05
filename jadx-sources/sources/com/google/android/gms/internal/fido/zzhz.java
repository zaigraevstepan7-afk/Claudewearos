package com.google.android.gms.internal.fido;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhz implements zzhy {
    public static final zzaq zza;
    public static final zzaq zzb;
    public static final zzaq zzc;
    public static final zzaq zzd;
    public static final zzaq zze;
    public static final zzaq zzf;
    public static final zzaq zzg;

    static {
        zzay zzayVarZzd = new zzay("com.google.android.gms.fido").zze(zzcf.zzl("FIDO")).zzd();
        zza = zzayVarZzd.zzc("Hybrid__client_enabled", false);
        zzb = zzayVarZzd.zzc("Hybrid__disavow_location_permissions", true);
        zzc = zzayVarZzd.zza("Hybrid__number_of_seconds_to_wait_for_bt_scanning_radio_to_be_ready", 3L);
        zzd = zzayVarZzd.zza("Hybrid__number_of_seconds_to_wait_for_bt_scanning_turning_on", 3L);
        zze = zzayVarZzd.zzc("Hybrid__prf_eval_during_create", true);
        zzf = zzayVarZzd.zzc("Hybrid__use_hybrid_for_server_link", false);
        zzg = zzayVarZzd.zzc("Hybrid__websocket_close_socket", true);
    }

    @Override // com.google.android.gms.internal.fido.zzhy
    public final boolean zza() {
        return ((Boolean) zza.zza()).booleanValue();
    }
}
