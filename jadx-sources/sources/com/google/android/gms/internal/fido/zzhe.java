package com.google.android.gms.internal.fido;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhe {
    public static String zza(zzgx zzgxVar) {
        StringBuilder sb2 = new StringBuilder(zzgxVar.zzd());
        for (int i10 = 0; i10 < zzgxVar.zzd(); i10++) {
            byte bZza = zzgxVar.zza(i10);
            if (bZza == 34) {
                sb2.append("\\\"");
            } else if (bZza == 39) {
                sb2.append("\\'");
            } else if (bZza != 92) {
                switch (bZza) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bZza < 32 || bZza > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bZza >>> 6) & 3) + 48));
                            sb2.append((char) (((bZza >>> 3) & 7) + 48));
                            sb2.append((char) ((bZza & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bZza);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
