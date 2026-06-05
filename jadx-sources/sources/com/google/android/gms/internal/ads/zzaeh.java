package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaeh {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) throws NumberFormatException {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = zzex.zza;
            int i10 = Integer.parseInt(strGroup, 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.zza = i10;
            this.zzb = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzav zzavVar) {
        for (int i10 = 0; i10 < zzavVar.zza(); i10++) {
            zzau zzauVarZzb = zzavVar.zzb(i10);
            if (zzauVarZzb instanceof zzagy) {
                zzagy zzagyVar = (zzagy) zzauVarZzb;
                if ("iTunSMPB".equals(zzagyVar.zzb) && zzc(zzagyVar.zzc)) {
                    return true;
                }
            } else if (zzauVarZzb instanceof zzahf) {
                zzahf zzahfVar = (zzahf) zzauVarZzb;
                if ("com.apple.iTunes".equals(zzahfVar.zza) && "iTunSMPB".equals(zzahfVar.zzb) && zzc(zzahfVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
