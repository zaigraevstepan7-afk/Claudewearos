package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mc.n;
import nc.t;
import nd.f;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfhp implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final rc.a zzf;
    private int zzi;
    private final zzdpp zzj;
    private final List zzk;
    private final zzbvw zzm;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfhu zzg = zzfhy.zzb();
    private String zzh = "";
    private boolean zzl = false;

    public zzfhp(Context context, rc.a aVar, zzdpp zzdppVar, zzdzy zzdzyVar, zzbvw zzbvwVar) {
        this.zze = context;
        this.zzf = aVar;
        this.zzj = zzdppVar;
        this.zzm = zzbvwVar;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjc)).booleanValue()) {
            this.zzk = r0.z();
        } else {
            this.zzk = zzfyf.zzn();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbev.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbev.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                zBooleanValue = zzb.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public static void zzb(zzfhp zzfhpVar, zzfhf zzfhfVar) {
        synchronized (zzd) {
            try {
                if (!zzfhpVar.zzl) {
                    zzfhpVar.zzl = true;
                    if (zza()) {
                        try {
                            r0 r0Var = n.D.f11577c;
                            zzfhpVar.zzh = r0.G(zzfhpVar.zze);
                        } catch (RemoteException | RuntimeException e10) {
                            n.D.f11582h.zzw(e10, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        f fVar = f.f12280b;
                        Context context = zzfhpVar.zze;
                        fVar.getClass();
                        zzfhpVar.zzi = f.a(context);
                        zzbct zzbctVar = zzbdc.zziX;
                        t tVar = t.f12227d;
                        int iIntValue = ((Integer) tVar.f12230c.zzb(zzbctVar)).intValue();
                        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzme)).booleanValue()) {
                            long j = iIntValue;
                            zzcad.zzd.scheduleWithFixedDelay(zzfhpVar, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j4 = iIntValue;
                            zzcad.zzd.scheduleAtFixedRate(zzfhpVar, j4, j4, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } finally {
            }
        }
        if (zza() && zzfhfVar != null) {
            synchronized (zzc) {
                try {
                    zzfhu zzfhuVar = zzfhpVar.zzg;
                    int iZza = zzfhuVar.zza();
                    zzbct zzbctVar2 = zzbdc.zziY;
                    t tVar2 = t.f12227d;
                    if (iZza >= ((Integer) tVar2.f12230c.zzb(zzbctVar2)).intValue()) {
                        return;
                    }
                    zzfhq zzfhqVarZza = zzfht.zza();
                    zzfhqVarZza.zzu(zzfhfVar.zzm());
                    zzfhqVarZza.zzq(zzfhfVar.zzl());
                    zzfhqVarZza.zzg(zzfhfVar.zzb());
                    zzfhqVarZza.zzw(3);
                    zzfhqVarZza.zzn(zzfhpVar.zzf.f14321a);
                    zzfhqVarZza.zzb(zzfhpVar.zzh);
                    zzfhqVarZza.zzk(Build.VERSION.RELEASE);
                    zzfhqVarZza.zzr(Build.VERSION.SDK_INT);
                    zzfhqVarZza.zzv(zzfhfVar.zzo());
                    zzfhqVarZza.zzj(zzfhfVar.zza());
                    zzfhqVarZza.zze(zzfhpVar.zzi);
                    zzfhqVarZza.zzt(zzfhfVar.zzn());
                    zzfhqVarZza.zzc(zzfhfVar.zze());
                    zzfhqVarZza.zzf(zzfhfVar.zzg());
                    zzfhqVarZza.zzh(zzfhfVar.zzh());
                    zzfhqVarZza.zzi(zzfhpVar.zzj.zzb(zzfhfVar.zzh()));
                    zzfhqVarZza.zzl(zzfhfVar.zzi());
                    zzfhqVarZza.zzm(zzfhfVar.zzd());
                    zzfhqVarZza.zzd(zzfhfVar.zzf());
                    zzfhqVarZza.zzs(zzfhfVar.zzk());
                    zzfhqVarZza.zzo(zzfhfVar.zzj());
                    zzfhqVarZza.zzp(zzfhfVar.zzc());
                    if (((Boolean) tVar2.f12230c.zzb(zzbdc.zzjc)).booleanValue()) {
                        zzfhqVarZza.zza(zzfhpVar.zzk);
                    }
                    zzfhv zzfhvVarZza = zzfhw.zza();
                    zzfhvVarZza.zza(zzfhqVarZza);
                    zzfhuVar.zzb(zzfhvVarZza);
                } finally {
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfhu zzfhuVar = this.zzg;
                            bArrZzaV = ((zzfhy) zzfhuVar.zzbr()).zzaV();
                            zzfhuVar.zzc();
                        }
                        new zzdzx(this.zze, this.zzf.f14321a, this.zzm, Binder.getCallingUid()).zza(new zzdzv((String) t.f12227d.f12230c.zzb(zzbdc.zziW), 60000, new HashMap(), bArrZzaV, "application/x-protobuf", false));
                    } catch (Exception e10) {
                        if ((e10 instanceof zzdwe) && ((zzdwe) e10).zza() == 3) {
                            return;
                        }
                        n.D.f11582h.zzv(e10, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void zzc(final zzfhf zzfhfVar) {
        zzcad.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfho
            @Override // java.lang.Runnable
            public final void run() {
                zzfhp.zzb(this.zza, zzfhfVar);
            }
        });
    }
}
