package gk;

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.i f7466a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f7467b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f7468c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f7469d;

    static {
        kk.i iVar = kk.i.f9700d;
        f7466a = mk.b.p("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f7467b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f7468c = new String[64];
        f7469d = new String[256];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = f7469d;
            if (i11 >= strArr.length) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i11)};
            byte[] bArr = bk.d.f1785a;
            strArr[i11] = String.format(Locale.US, "%8s", objArr).replace(' ', '0');
            i11++;
        }
        String[] strArr2 = f7468c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i12 = iArr[0];
        strArr2[i12 | 8] = m6.a.j(new StringBuilder(), strArr2[i12], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            int i15 = iArr[0];
            String[] strArr3 = f7468c;
            int i16 = i15 | i14;
            strArr3[i16] = strArr3[i15] + '|' + strArr3[i14];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i15]);
            sb2.append('|');
            strArr3[i16 | 8] = m6.a.j(sb2, strArr3[i14], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f7468c;
            if (i10 >= strArr4.length) {
                return;
            }
            if (strArr4[i10] == null) {
                strArr4[i10] = f7469d[i10];
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(boolean r4, int r5, int r6, byte r7, byte r8) {
        /*
            java.lang.String[] r0 = gk.g.f7467b
            int r1 = r0.length
            if (r7 >= r1) goto L8
            r0 = r0[r7]
            goto L1a
        L8:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            byte[] r1 = bk.d.f1785a
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "0x%02x"
            java.lang.String r0 = java.lang.String.format(r1, r2, r0)
        L1a:
            if (r8 != 0) goto L1f
            java.lang.String r7 = ""
            goto L6a
        L1f:
            r1 = 2
            java.lang.String[] r2 = gk.g.f7469d
            if (r7 == r1) goto L68
            r1 = 3
            if (r7 == r1) goto L68
            r1 = 4
            if (r7 == r1) goto L5f
            r1 = 6
            if (r7 == r1) goto L5f
            r1 = 7
            if (r7 == r1) goto L68
            r1 = 8
            if (r7 == r1) goto L68
            java.lang.String[] r1 = gk.g.f7468c
            int r3 = r1.length
            if (r8 >= r3) goto L3c
            r1 = r1[r8]
            goto L3e
        L3c:
            r1 = r2[r8]
        L3e:
            r2 = 5
            if (r7 != r2) goto L4e
            r2 = r8 & 4
            if (r2 == 0) goto L4e
            java.lang.String r7 = "HEADERS"
            java.lang.String r8 = "PUSH_PROMISE"
            java.lang.String r7 = r1.replace(r7, r8)
            goto L6a
        L4e:
            if (r7 != 0) goto L5d
            r7 = r8 & 32
            if (r7 == 0) goto L5d
            java.lang.String r7 = "PRIORITY"
            java.lang.String r8 = "COMPRESSED"
            java.lang.String r7 = r1.replace(r7, r8)
            goto L6a
        L5d:
            r7 = r1
            goto L6a
        L5f:
            r7 = 1
            if (r8 != r7) goto L65
            java.lang.String r7 = "ACK"
            goto L6a
        L65:
            r7 = r2[r8]
            goto L6a
        L68:
            r7 = r2[r8]
        L6a:
            if (r4 == 0) goto L6f
            java.lang.String r4 = "<<"
            goto L71
        L6f:
            java.lang.String r4 = ">>"
        L71:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r0, r7}
            byte[] r5 = bk.d.f1785a
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r6 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = java.lang.String.format(r5, r6, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.g.a(boolean, int, int, byte, byte):java.lang.String");
    }

    public static void b(String str, Object... objArr) {
        byte[] bArr = bk.d.f1785a;
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    public static void c(String str, Object... objArr) {
        byte[] bArr = bk.d.f1785a;
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
