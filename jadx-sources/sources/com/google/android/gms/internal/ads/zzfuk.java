package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfuk {
    public static String zza(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (zze(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c6 = charArray[i10];
                    if (zze(c6)) {
                        charArray[i10] = (char) (c6 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String zzb(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (zzd(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c6 = charArray[i10];
                    if (zzd(c6)) {
                        charArray[i10] = (char) (c6 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static boolean zzc(CharSequence charSequence, CharSequence charSequence2) {
        int iZzf;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            char cCharAt2 = charSequence2.charAt(i10);
            if (cCharAt != cCharAt2 && ((iZzf = zzf(cCharAt)) >= 26 || iZzf != zzf(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzd(char c6) {
        return c6 >= 'a' && c6 <= 'z';
    }

    public static boolean zze(char c6) {
        return c6 >= 'A' && c6 <= 'Z';
    }

    private static int zzf(char c6) {
        return (char) ((c6 | ' ') - 97);
    }
}
