package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import mc.n;
import nc.h2;
import nc.t;
import qc.t0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfhd implements zzfhb {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfhr zzj = zzfhr.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    public zzfhd(Context context, int i10) {
        this.zza = context;
        this.zzp = i10;
    }

    public final synchronized zzfhd zzA() {
        n.D.f11584k.getClass();
        this.zzc = SystemClock.elapsedRealtime();
        return this;
    }

    public final synchronized zzfhd zzK(int i10) {
        this.zzq = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhb
    public final /* bridge */ /* synthetic */ zzfhb zza(h2 h2Var) {
        zzr(h2Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhb
    public final /* bridge */ /* synthetic */ zzfhb zzb(zzfce zzfceVar) {
        zzs(zzfceVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhb
    public final /* bridge */ /* synthetic */ zzfhb zzc(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhb
    public final /* bridge */ /* synthetic */ zzfhb zzd(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhb
    public final /* bridge */ /* synthetic */ zzfhb zze(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhb
    public final /* bridge */ /* synthetic */ zzfhb zzf(zzfhr zzfhrVar) {
        zzw(zzfhrVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhb
    public final /* bridge */ /* synthetic */ zzfhb zzg(boolean z2) {
        zzx(z2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhb
    public final /* bridge */ /* synthetic */ zzfhb zzh(Throwable th2) {
        zzy(th2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhb
    public final /* bridge */ /* synthetic */ zzfhb zzi() {
        zzz();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhb
    public final /* bridge */ /* synthetic */ zzfhb zzj() {
        zzA();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhb
    public final synchronized boolean zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfhb
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfhb
    public final synchronized zzfhf zzm() {
        try {
            zzfhe zzfheVar = null;
            if (this.zzn) {
                return null;
            }
            this.zzn = true;
            if (!this.zzo) {
                zzz();
            }
            if (this.zzc < 0) {
                zzA();
            }
            return new zzfhf(this, zzfheVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhb
    public final /* bridge */ /* synthetic */ zzfhb zzn(int i10) {
        zzK(i10);
        return this;
    }

    public final synchronized zzfhd zzr(h2 h2Var) {
        try {
            IBinder iBinder = h2Var.f12118e;
            if (iBinder != null) {
                zzcvk zzcvkVar = (zzcvk) iBinder;
                String strZzl = zzcvkVar.zzl();
                if (!TextUtils.isEmpty(strZzl)) {
                    this.zzf = strZzl;
                }
                String strZzi = zzcvkVar.zzi();
                if (!TextUtils.isEmpty(strZzi)) {
                    this.zzg = strZzi;
                }
            }
        } finally {
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r2.zzg = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzfhd zzs(com.google.android.gms.internal.ads.zzfce r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfbw r0 = r3.zzb     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> Le
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L10
            r2.zzf = r0     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r3 = move-exception
            goto L2e
        L10:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Le
        L16:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.internal.ads.zzfbt r0 = (com.google.android.gms.internal.ads.zzfbt) r0     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.zzab     // Catch: java.lang.Throwable -> Le
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L16
            r2.zzg = r0     // Catch: java.lang.Throwable -> Le
        L2c:
            monitor-exit(r2)
            return r2
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfhd.zzs(com.google.android.gms.internal.ads.zzfce):com.google.android.gms.internal.ads.zzfhd");
    }

    public final synchronized zzfhd zzt(String str) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjb)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }

    public final synchronized zzfhd zzu(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfhd zzv(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfhd zzw(zzfhr zzfhrVar) {
        this.zzj = zzfhrVar;
        return this;
    }

    public final synchronized zzfhd zzx(boolean z2) {
        this.zzd = z2;
        return this;
    }

    public final synchronized zzfhd zzy(Throwable th2) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjb)).booleanValue()) {
            this.zzl = zzbul.zzf(th2);
            this.zzk = (String) zzfvt.zzb(zzfup.zzc('\n')).zzd(zzbul.zze(th2)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfhd zzz() {
        Configuration configuration;
        n nVar = n.D;
        t0 t0Var = nVar.f11580f;
        Context context = this.zza;
        this.zze = t0Var.c(context);
        Resources resources = context.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i10;
        nVar.f11584k.getClass();
        this.zzb = SystemClock.elapsedRealtime();
        this.zzo = true;
        return this;
    }
}
