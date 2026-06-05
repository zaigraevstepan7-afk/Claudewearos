package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzajd {
    /* JADX WARN: Removed duplicated region for block: B:130:0x025b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:9:0x0030, B:11:0x003b, B:14:0x004a, B:17:0x0056, B:20:0x0063, B:23:0x0072, B:26:0x007f, B:29:0x008d, B:31:0x0097, B:39:0x00b2, B:40:0x00c3, B:41:0x00d6, B:44:0x00e2, B:47:0x00ef, B:50:0x00fc, B:53:0x0109, B:56:0x0116, B:59:0x0123, B:62:0x0130, B:65:0x013d, B:68:0x014a, B:71:0x0157, B:75:0x0168, B:77:0x016e, B:79:0x0182, B:80:0x0189, B:82:0x0190, B:87:0x019b, B:92:0x01a7, B:130:0x025b, B:93:0x01bc, B:95:0x01c3, B:97:0x01cd, B:98:0x01e1, B:111:0x020d, B:114:0x021a, B:117:0x0226, B:120:0x0232, B:123:0x023e, B:126:0x024a, B:129:0x0254, B:131:0x026f, B:132:0x0276), top: B:137:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzau zza(com.google.android.gms.internal.ads.zzen r15) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajd.zza(com.google.android.gms.internal.ads.zzen):com.google.android.gms.internal.ads.zzau");
    }

    private static int zzb(zzen zzenVar) {
        int iZzg = zzenVar.zzg();
        if (zzenVar.zzg() == 1684108385) {
            zzenVar.zzM(8);
            int i10 = iZzg - 16;
            if (i10 == 1) {
                return zzenVar.zzm();
            }
            if (i10 == 2) {
                return zzenVar.zzq();
            }
            if (i10 == 3) {
                return zzenVar.zzo();
            }
            if (i10 == 4 && (zzenVar.zzf() & 128) == 0) {
                return zzenVar.zzp();
            }
        }
        zzea.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzahd zzc(int i10, String str, zzen zzenVar, boolean z2, boolean z10) {
        int iZzb = zzb(zzenVar);
        if (z10) {
            iZzb = Math.min(1, iZzb);
        }
        if (iZzb >= 0) {
            return z2 ? new zzahi(str, null, zzfyf.zzo(Integer.toString(iZzb))) : new zzagy("und", str, Integer.toString(iZzb));
        }
        zzea.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzff.zze(i10)));
        return null;
    }

    private static zzahi zzd(int i10, String str, zzen zzenVar) {
        int iZzg = zzenVar.zzg();
        if (zzenVar.zzg() == 1684108385 && iZzg >= 22) {
            zzenVar.zzM(10);
            int iZzq = zzenVar.zzq();
            if (iZzq > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iZzq);
                String string = sb2.toString();
                int iZzq2 = zzenVar.zzq();
                if (iZzq2 > 0) {
                    string = string + "/" + iZzq2;
                }
                return new zzahi(str, null, zzfyf.zzo(string));
            }
        }
        zzea.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzff.zze(i10)));
        return null;
    }

    private static zzahi zze(int i10, String str, zzen zzenVar) {
        int iZzg = zzenVar.zzg();
        if (zzenVar.zzg() == 1684108385) {
            zzenVar.zzM(8);
            return new zzahi(str, null, zzfyf.zzo(zzenVar.zzA(iZzg - 16)));
        }
        zzea.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzff.zze(i10)));
        return null;
    }
}
