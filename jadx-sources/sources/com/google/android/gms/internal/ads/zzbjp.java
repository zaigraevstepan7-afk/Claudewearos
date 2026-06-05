package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbjp implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcfe zzcfeVar = (zzcfe) obj;
        try {
            zzfrv.zzj(zzcfeVar.getContext()).zzk();
            zzfrw.zzi(zzcfeVar.getContext()).zzj();
            zzfrx.zza(zzcfeVar.getContext()).zzb(null);
        } catch (IOException e10) {
            n.D.f11582h.zzw(e10, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
