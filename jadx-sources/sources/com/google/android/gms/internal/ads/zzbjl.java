package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import mc.n;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbjl implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) throws NumberFormatException {
        zzcfe zzcfeVar = (zzcfe) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            l0.k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfto zzftoVarZzl = zzftp.zzl();
        zzftoVarZzl.zzb((String) map.get("appId"));
        zzftoVarZzl.zzh(zzcfeVar.getWidth());
        zzftoVarZzl.zzg(zzcfeVar.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzftoVarZzl.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzftoVarZzl.zzd(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzftoVarZzl.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzftoVarZzl.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzftoVarZzl.zza((String) map.get("enifd"));
        }
        try {
            n.D.f11592s.e(zzcfeVar, zzftoVarZzl.zzi());
        } catch (NullPointerException e10) {
            n.D.f11582h.zzw(e10, "DefaultGmsgHandlers.ShowLMDOverlay");
            l0.k("Missing parameters for LMD Overlay show request");
        }
    }
}
