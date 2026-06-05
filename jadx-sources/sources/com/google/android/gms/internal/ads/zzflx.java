package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzflx implements zzfma {
    private static final zzflx zza = new zzflx(new zzfmb());
    private Date zzb;
    private boolean zzc;
    private final zzfmb zzd;
    private boolean zze;

    private zzflx(zzfmb zzfmbVar) {
        this.zzd = zzfmbVar;
    }

    public static zzflx zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final void zzc(boolean z2) {
        if (!this.zze && z2) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    Iterator it = zzflz.zza().zzb().iterator();
                    while (it.hasNext()) {
                        ((zzflh) it.next()).zzg().zzg(zzb());
                    }
                }
            }
        }
        this.zze = z2;
    }

    public final void zzd(Context context) {
        if (this.zzc) {
            return;
        }
        zzfmb zzfmbVar = this.zzd;
        zzfmbVar.zzd(context);
        zzfmbVar.zze(this);
        zzfmbVar.zzf();
        this.zze = zzfmbVar.zza;
        this.zzc = true;
    }
}
