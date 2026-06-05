package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import mc.n;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcda implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) throws NumberFormatException {
        zzcbz zzcbzVar = (zzcbz) obj;
        zzcgg zzcggVarZzq = zzcbzVar.zzq();
        if (zzcggVarZzq == null) {
            try {
                zzcgg zzcggVar = new zzcgg(zzcbzVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcbzVar.zzC(zzcggVar);
                zzcggVarZzq = zzcggVar;
            } catch (NullPointerException e10) {
                e = e10;
                Throwable th2 = e;
                int i10 = l0.f13401b;
                k.e("Unable to parse videoMeta message.", th2);
                n.D.f11582h.zzw(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e11) {
                e = e11;
                Throwable th22 = e;
                int i102 = l0.f13401b;
                k.e("Unable to parse videoMeta message.", th22);
                n.D.f11582h.zzw(th22, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f10 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f11 = Float.parseFloat((String) map.get("currentTime"));
        int i11 = Integer.parseInt((String) map.get("playbackState"));
        if (i11 < 0 || i11 > 3) {
            i11 = 0;
        }
        String str = (String) map.get("aspectRatio");
        float f12 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (k.j(3)) {
            k.b("Video Meta GMSG: currentTime : " + f11 + " , duration : " + f10 + " , isMuted : " + zEquals + " , playbackState : " + i11 + " , aspectRatio : " + str);
        }
        zzcggVarZzq.zzr(f11, f10, i11, zEquals, f12);
    }
}
