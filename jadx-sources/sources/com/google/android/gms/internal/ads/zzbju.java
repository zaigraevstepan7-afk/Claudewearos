package com.google.android.gms.internal.ads;

import java.util.Map;
import pc.i;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbju implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfe zzcfeVar = (zzcfe) obj;
        if (zzcfeVar.zzJ() != null) {
            zzcfeVar.zzJ().zza();
        }
        i iVarZzL = zzcfeVar.zzL();
        if (iVarZzL != null) {
            iVarZzL.zzb();
            return;
        }
        i iVarZzM = zzcfeVar.zzM();
        if (iVarZzM != null) {
            iVarZzM.zzb();
        } else {
            int i10 = l0.f13401b;
            k.g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
