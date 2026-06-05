package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import java.util.concurrent.Callable;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeod implements zzetu {
    private final zzgdm zza;
    private final Context zzb;

    public zzeod(zzgdm zzgdmVar, Context context) {
        this.zza = zzgdmVar;
        this.zzb = context;
    }

    public static zzeoe zzc(zzeod zzeodVar) {
        double intExtra;
        boolean zIsCharging;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzml)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) zzeodVar.zzb.getSystemService("batterymanager");
            intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
            zIsCharging = batteryManager != null ? batteryManager.isCharging() : zze(zzeodVar.zzd());
        } else {
            Intent intentZzd = zzeodVar.zzd();
            boolean zZze = zze(intentZzd);
            intExtra = intentZzd != null ? intentZzd.getIntExtra("level", -1) / intentZzd.getIntExtra("scale", -1) : -1.0d;
            zIsCharging = zZze;
        }
        return new zzeoe(intExtra, zIsCharging);
    }

    @SuppressLint({"UnprotectedReceiver"})
    private final Intent zzd() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzll)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.zzb.registerReceiver(null, intentFilter) : this.zzb.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean zze(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    @SuppressLint({"UnprotectedReceiver"})
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeod.zzc(this.zza);
            }
        });
    }
}
