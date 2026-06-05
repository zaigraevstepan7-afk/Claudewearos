package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import wd.a;
import y8.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzady extends zzacf {
    private final String zza;
    private final /* synthetic */ zzadx zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzady(zzadx zzadxVar, zzacf zzacfVar, String str) {
        super(zzacfVar);
        this.zzb = zzadxVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacf
    public final void zza(Status status) {
        zzadx.zza.c(f.b("SMS verification code request failed: ", a.D(status.f3491a), " ", status.f3492b), new Object[0]);
        zzaea zzaeaVar = (zzaea) this.zzb.zzd.get(this.zza);
        if (zzaeaVar == null) {
            return;
        }
        Iterator<zzacf> it = zzaeaVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(status);
        }
        this.zzb.zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacf
    public final void zzb(String str) {
        zzadx.zza.a("onCodeSent", new Object[0]);
        zzaea zzaeaVar = (zzaea) this.zzb.zzd.get(this.zza);
        if (zzaeaVar == null) {
            return;
        }
        Iterator<zzacf> it = zzaeaVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zzb(str);
        }
        zzaeaVar.zzg = true;
        zzaeaVar.zzd = str;
        if (zzaeaVar.zza <= 0) {
            this.zzb.zzb(this.zza);
        } else if (!zzaeaVar.zzc) {
            this.zzb.zze(this.zza);
        } else {
            if (zzah.zzc(zzaeaVar.zze)) {
                return;
            }
            zzadx.zza(this.zzb, this.zza);
        }
    }
}
