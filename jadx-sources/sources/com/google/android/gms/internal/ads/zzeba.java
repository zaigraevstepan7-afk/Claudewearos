package com.google.android.gms.internal.ads;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbch;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeba implements zzfgt {
    private final zzeao zza;
    private final zzeas zzb;

    public zzeba(zzeao zzeaoVar, zzeas zzeasVar) {
        this.zza = zzeaoVar;
        this.zzb = zzeasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzd(zzfgm zzfgmVar, String str) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgq)).booleanValue() && zzfgm.RENDERER == zzfgmVar) {
            zzeao zzeaoVar = this.zza;
            if (zzeaoVar.zzc() != 0) {
                n.D.f11584k.getClass();
                zzeaoVar.zzf(SystemClock.elapsedRealtime() - zzeaoVar.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdF(zzfgm zzfgmVar, String str, Throwable th2) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgq)).booleanValue() && zzfgm.RENDERER == zzfgmVar) {
            zzeao zzeaoVar = this.zza;
            if (zzeaoVar.zzc() != 0) {
                n.D.f11584k.getClass();
                zzeaoVar.zzf(SystemClock.elapsedRealtime() - zzeaoVar.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdG(zzfgm zzfgmVar, String str) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgq)).booleanValue()) {
            if (zzfgm.RENDERER == zzfgmVar) {
                zzeao zzeaoVar = this.zza;
                n.D.f11584k.getClass();
                zzeaoVar.zzg(SystemClock.elapsedRealtime());
            } else if (zzfgm.PRELOADED_LOADER == zzfgmVar || zzfgm.SERVER_TRANSACTION == zzfgmVar) {
                zzeao zzeaoVar2 = this.zza;
                n.D.f11584k.getClass();
                zzeaoVar2.zzh(SystemClock.elapsedRealtime());
                final zzeas zzeasVar = this.zzb;
                final long jZzd = zzeaoVar2.zzd();
                zzeasVar.zza.zza(new zzffw() { // from class: com.google.android.gms.internal.ads.zzear
                    @Override // com.google.android.gms.internal.ads.zzffw
                    public final Object zza(Object obj) throws SQLException {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzeasVar.zzf()) {
                            return null;
                        }
                        long j = jZzd;
                        zzbch.zzaf.zza.C0002zza c0002zzaZzn = zzbch.zzaf.zza.zzn();
                        c0002zzaZzn.zzP(j);
                        byte[] bArrZzaV = c0002zzaZzn.zzbr().zzaV();
                        zzeaz.zzf(sQLiteDatabase, false, false);
                        zzeaz.zzc(sQLiteDatabase, j, bArrZzaV);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdE(zzfgm zzfgmVar, String str) {
    }
}
