package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzamk implements zzakr {
    private final zzen zza = new zzen();
    private final zzama zzb = new zzama();

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i10, int i11, zzakq zzakqVar, zzdn zzdnVar) throws zzaz {
        zzen zzenVar = this.zza;
        zzenVar.zzJ(bArr, i11 + i10);
        zzenVar.zzL(i10);
        ArrayList arrayList = new ArrayList();
        try {
            int iZzc = zzenVar.zzc();
            Charset charset = StandardCharsets.UTF_8;
            String strZzz = zzenVar.zzz(charset);
            if (strZzz == null || !strZzz.startsWith("WEBVTT")) {
                zzenVar.zzL(iZzc);
                throw zzaz.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzenVar.zzz(charset))), null);
            }
            while (!TextUtils.isEmpty(zzenVar.zzz(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c6 = '\uffff';
                int iZzc2 = 0;
                while (c6 == '\uffff') {
                    iZzc2 = zzenVar.zzc();
                    String strZzz2 = zzenVar.zzz(StandardCharsets.UTF_8);
                    c6 = strZzz2 == null ? (char) 0 : "STYLE".equals(strZzz2) ? (char) 2 : strZzz2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzenVar.zzL(iZzc2);
                if (c6 == 0) {
                    zzakl.zza(new zzamn(arrayList2), zzakqVar, zzdnVar);
                    return;
                }
                if (c6 == 1) {
                    while (!TextUtils.isEmpty(zzenVar.zzz(StandardCharsets.UTF_8))) {
                    }
                } else if (c6 != 2) {
                    zzamc zzamcVarZzc = zzamj.zzc(zzenVar, arrayList);
                    if (zzamcVarZzc != null) {
                        arrayList2.add(zzamcVarZzc);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzenVar.zzz(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zzb(zzenVar));
                }
            }
        } catch (zzaz e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
