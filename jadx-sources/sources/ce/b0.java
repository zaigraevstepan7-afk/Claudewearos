package ce;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.Arrays;
import java.util.List;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 extends l {
    public static final Parcelable.Creator<b0> CREATOR = new ae.b(15);
    public final f A;
    public final Long B;
    public final ResultReceiver C;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3233a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f3234b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3235c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3236d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f3237e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f3238f;

    /* renamed from: z, reason: collision with root package name */
    public final n0 f3239z;

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[Catch: w0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {w0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: w0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {w0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[Catch: w0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {w0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[Catch: w0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {w0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5 A[Catch: w0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {w0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[Catch: w0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {w0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb A[Catch: w0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {w0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106 A[Catch: w0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {w0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d A[Catch: w0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {w0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0131 A[Catch: w0 -> 0x0054, JSONException -> 0x0057, TryCatch #3 {w0 -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:18:0x006b, B:20:0x007a, B:26:0x008d, B:27:0x0093, B:29:0x0099, B:32:0x00ac, B:34:0x00b2, B:36:0x00bf, B:38:0x00c5, B:40:0x00d7, B:42:0x00dd, B:44:0x00e5, B:46:0x00eb, B:48:0x00f5, B:50:0x00fb, B:56:0x0117, B:58:0x011d, B:60:0x012a, B:64:0x0134, B:63:0x0131, B:52:0x0106, B:54:0x010c, B:21:0x007f, B:23:0x0085, B:14:0x005a, B:16:0x0060), top: B:81:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(byte[] r28, java.lang.Double r29, java.lang.String r30, java.util.ArrayList r31, java.lang.Integer r32, ce.l0 r33, java.lang.String r34, ce.f r35, java.lang.Long r36, java.lang.String r37, android.os.ResultReceiver r38) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.b0.<init>(byte[], java.lang.Double, java.lang.String, java.util.ArrayList, java.lang.Integer, ce.l0, java.lang.String, ce.f, java.lang.Long, java.lang.String, android.os.ResultReceiver):void");
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        List list2 = b0Var.f3236d;
        return Arrays.equals(this.f3233a, b0Var.f3233a) && com.google.android.gms.common.internal.e0.l(this.f3234b, b0Var.f3234b) && com.google.android.gms.common.internal.e0.l(this.f3235c, b0Var.f3235c) && (((list = this.f3236d) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && com.google.android.gms.common.internal.e0.l(this.f3237e, b0Var.f3237e) && com.google.android.gms.common.internal.e0.l(this.f3238f, b0Var.f3238f) && com.google.android.gms.common.internal.e0.l(this.f3239z, b0Var.f3239z) && com.google.android.gms.common.internal.e0.l(this.A, b0Var.A) && com.google.android.gms.common.internal.e0.l(this.B, b0Var.B);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f3233a)), this.f3234b, this.f3235c, this.f3236d, this.f3237e, this.f3238f, this.f3239z, this.A, this.B});
    }

    public final String toString() {
        String strH = ud.c.h(this.f3233a);
        String strValueOf = String.valueOf(this.f3236d);
        String strValueOf2 = String.valueOf(this.f3238f);
        String strValueOf3 = String.valueOf(this.f3239z);
        String strValueOf4 = String.valueOf(this.A);
        StringBuilder sbK = m6.a.k("PublicKeyCredentialRequestOptions{\n challenge=", strH, ", \n timeoutSeconds=");
        sbK.append(this.f3234b);
        sbK.append(", \n rpId='");
        m1.s(sbK, this.f3235c, "', \n allowList=", strValueOf, ", \n requestId=");
        sbK.append(this.f3237e);
        sbK.append(", \n tokenBinding=");
        sbK.append(strValueOf2);
        sbK.append(", \n userVerification=");
        m1.s(sbK, strValueOf3, ", \n authenticationExtensions=", strValueOf4, ", \n longRequestId=");
        sbK.append(this.B);
        sbK.append("}");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.V(parcel, 2, this.f3233a, false);
        uk.c.W(parcel, 3, this.f3234b);
        uk.c.c0(parcel, 4, this.f3235c, false);
        uk.c.g0(parcel, 5, this.f3236d, false);
        uk.c.Z(parcel, 6, this.f3237e);
        uk.c.b0(parcel, 7, this.f3238f, i10, false);
        n0 n0Var = this.f3239z;
        uk.c.c0(parcel, 8, n0Var == null ? null : n0Var.f3299a, false);
        uk.c.b0(parcel, 9, this.A, i10, false);
        uk.c.a0(parcel, 10, this.B);
        uk.c.b0(parcel, 12, this.C, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
