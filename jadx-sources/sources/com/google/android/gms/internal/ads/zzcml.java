package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.gms.common.api.f;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import nc.t;
import qc.n0;
import qc.o0;
import rc.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcml {
    zzbun zza;
    zzbun zzb;
    private final Context zzc;
    private final n0 zzd;
    private final zzeda zze;
    private final zzdph zzf;
    private final zzgdm zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcml(Context context, n0 n0Var, zzeda zzedaVar, zzdph zzdphVar, zzgdm zzgdmVar, zzgdm zzgdmVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = n0Var;
        this.zze = zzedaVar;
        this.zzf = zzdphVar;
        this.zzg = zzgdmVar;
        this.zzh = zzgdmVar2;
        this.zzi = scheduledExecutorService;
    }

    public static mf.a zzb(zzcml zzcmlVar, final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) t.f12227d.f12230c.zzb(zzbdc.zzkw), "10");
            return zzgdb.zzh(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        zzbct zzbctVar = zzbdc.zzkx;
        t tVar = t.f12227d;
        builderBuildUpon.appendQueryParameter((String) tVar.f12230c.zzb(zzbctVar), "1");
        builderBuildUpon.appendQueryParameter((String) tVar.f12230c.zzb(zzbdc.zzkw), "12");
        if (str.contains((CharSequence) tVar.f12230c.zzb(zzbdc.zzky))) {
            builderBuildUpon.authority((String) tVar.f12230c.zzb(zzbdc.zzkz));
        }
        return (zzgcs) zzgdb.zzn(zzgcs.zzw(zzcmlVar.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzgci() { // from class: com.google.android.gms.internal.ads.zzcmh
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                String str2 = (String) t.f12227d.f12230c.zzb(zzbdc.zzkw);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzgdb.zzh(builder2.toString());
            }
        }, zzcmlVar.zzh);
    }

    public static /* synthetic */ mf.a zzc(final zzcml zzcmlVar, String str, final Throwable th2) {
        zzcmlVar.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcme
            @Override // java.lang.Runnable
            public final void run() {
                zzcml.zzg(this.zza, th2);
            }
        });
        return zzgdb.zzh(str);
    }

    public static mf.a zzd(final zzcml zzcmlVar, Uri.Builder builder, final Throwable th2) {
        zzcmlVar.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmd
            @Override // java.lang.Runnable
            public final void run() {
                zzcml.zzh(this.zza, th2);
            }
        });
        builder.appendQueryParameter((String) t.f12227d.f12230c.zzb(zzbdc.zzkw), "9");
        return zzgdb.zzh(builder.toString());
    }

    public static void zzg(zzcml zzcmlVar, Throwable th2) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkB)).booleanValue()) {
            zzbun zzbunVarZzc = zzbul.zzc(zzcmlVar.zzc);
            zzcmlVar.zzb = zzbunVarZzc;
            zzbunVarZzc.zzh(th2, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbun zzbunVarZza = zzbul.zza(zzcmlVar.zzc);
            zzcmlVar.zza = zzbunVarZza;
            zzbunVarZza.zzh(th2, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    public static void zzh(zzcml zzcmlVar, Throwable th2) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkB)).booleanValue()) {
            zzbun zzbunVarZzc = zzbul.zzc(zzcmlVar.zzc);
            zzcmlVar.zzb = zzbunVarZzc;
            zzbunVarZzc.zzh(th2, "AttributionReporting");
        } else {
            zzbun zzbunVarZza = zzbul.zza(zzcmlVar.zzc);
            zzcmlVar.zza = zzbunVarZza;
            zzbunVarZza.zzh(th2, "AttributionReportingSampled");
        }
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) t.f12227d.f12230c.zzb(zzbdc.zzku));
    }

    private final mf.a zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            zzbct zzbctVar = zzbdc.zzku;
            t tVar = t.f12227d;
            if (!str.contains((CharSequence) tVar.f12230c.zzb(zzbctVar)) || ((o0) this.zzd).k()) {
                return zzgdb.zzh(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) tVar.f12230c.zzb(zzbdc.zzkv), String.valueOf(random.nextInt(f.API_PRIORITY_OTHER)));
            if (inputEvent != null) {
                return (zzgcs) zzgdb.zzf((zzgcs) zzgdb.zzn(zzgcs.zzw(this.zze.zza()), new zzgci() { // from class: com.google.android.gms.internal.ads.zzcmf
                    @Override // com.google.android.gms.internal.ads.zzgci
                    public final mf.a zza(Object obj) {
                        return zzcml.zzb(this.zza, builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzcmg
                    @Override // com.google.android.gms.internal.ads.zzgci
                    public final mf.a zza(Object obj) {
                        return zzcml.zzd(this.zza, builderBuildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((String) tVar.f12230c.zzb(zzbdc.zzkw), "11");
            return zzgdb.zzh(builderBuildUpon.toString());
        } catch (Exception e10) {
            return zzgdb.zzg(e10);
        }
    }

    public final mf.a zze(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgdb.zzh(str) : zzgdb.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzcmc
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzcml.zzc(this.zza, str, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final void zzi(String str, zzfjq zzfjqVar, Random random, p pVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgdb.zzr(zzgdb.zzo(zzk(str, this.zzf.zza(), random), ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzkA)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcmk(this, zzfjqVar, str, pVar), this.zzg);
    }
}
