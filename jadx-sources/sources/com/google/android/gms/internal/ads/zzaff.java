package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaff {
    public static int zza(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static zzav zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = zzex.zza;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                zzea.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzagr.zzb(new zzen(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e10) {
                    zzea.zzg("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new zzaho(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzav(arrayList);
    }

    public static zzafc zzc(zzen zzenVar, boolean z2, boolean z10) throws zzaz {
        if (z2) {
            zzd(3, zzenVar, false);
        }
        String strZzB = zzenVar.zzB((int) zzenVar.zzs(), StandardCharsets.UTF_8);
        int length = strZzB.length();
        long jZzs = zzenVar.zzs();
        String[] strArr = new String[(int) jZzs];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jZzs; i10++) {
            String strZzB2 = zzenVar.zzB((int) zzenVar.zzs(), StandardCharsets.UTF_8);
            strArr[i10] = strZzB2;
            length2 = length2 + 4 + strZzB2.length();
        }
        if (z10 && (zzenVar.zzm() & 1) == 0) {
            throw zzaz.zza("framing bit expected to be set", null);
        }
        return new zzafc(strZzB, strArr, length2 + 1);
    }

    public static boolean zzd(int i10, zzen zzenVar, boolean z2) throws zzaz {
        if (zzenVar.zza() < 7) {
            if (z2) {
                return false;
            }
            throw zzaz.zza("too short header: " + zzenVar.zza(), null);
        }
        if (zzenVar.zzm() != i10) {
            if (z2) {
                return false;
            }
            throw zzaz.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        }
        if (zzenVar.zzm() == 118 && zzenVar.zzm() == 111 && zzenVar.zzm() == 114 && zzenVar.zzm() == 98 && zzenVar.zzm() == 105 && zzenVar.zzm() == 115) {
            return true;
        }
        if (z2) {
            return false;
        }
        throw zzaz.zza("expected characters 'vorbis'", null);
    }
}
