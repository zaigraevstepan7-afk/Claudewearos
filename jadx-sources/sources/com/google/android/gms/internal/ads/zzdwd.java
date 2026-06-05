package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import mc.n;
import nc.t;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdwd extends zzfrq {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdwc zzf;
    private boolean zzg;

    public zzdwd(Context context) {
        super("ShakeDetector", "ads");
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfrq
    public final void zza(SensorEvent sensorEvent) {
        zzbct zzbctVar = zzbdc.zzjk;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f12 * f12) + (f11 * f11) + (f10 * f10))) >= ((Float) zzbdaVar2.zzb(zzbdc.zzjl)).floatValue()) {
                n.D.f11584k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.zzd + ((Integer) zzbdaVar2.zzb(zzbdc.zzjm)).intValue() <= jCurrentTimeMillis) {
                    if (this.zzd + ((Integer) zzbdaVar2.zzb(zzbdc.zzjn)).intValue() < jCurrentTimeMillis) {
                        this.zze = 0;
                    }
                    l0.k("Shake detected.");
                    this.zzd = jCurrentTimeMillis;
                    int i10 = this.zze + 1;
                    this.zze = i10;
                    zzdwc zzdwcVar = this.zzf;
                    if (zzdwcVar == null || i10 != ((Integer) zzbdaVar2.zzb(zzbdc.zzjo)).intValue()) {
                        return;
                    }
                    zzdvb zzdvbVar = (zzdvb) zzdwcVar;
                    zzdvbVar.zzh(new zzduy(zzdvbVar), zzdva.GESTURE);
                }
            }
        }
    }

    public final void zzb() {
        synchronized (this) {
            try {
                if (this.zzg) {
                    SensorManager sensorManager = this.zzb;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.zzc);
                        l0.k("Stopped listening for shake gestures.");
                    }
                    this.zzg = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjk)).booleanValue()) {
                    if (this.zzb == null) {
                        SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                        this.zzb = sensorManager2;
                        if (sensorManager2 == null) {
                            int i10 = l0.f13401b;
                            k.g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.zzc = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        n.D.f11584k.getClass();
                        this.zzd = System.currentTimeMillis() - ((Integer) r1.f12230c.zzb(zzbdc.zzjm)).intValue();
                        this.zzg = true;
                        l0.k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzd(zzdwc zzdwcVar) {
        this.zzf = zzdwcVar;
    }
}
