package ce;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends od.a {
    public static final Parcelable.Creator<f> CREATOR = new ae.b(29);
    public final s0 A;
    public final w B;
    public final u0 C;
    public final v0 D;
    public final t0 E;

    /* renamed from: a, reason: collision with root package name */
    public final v f3251a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f3252b;

    /* renamed from: c, reason: collision with root package name */
    public final m0 f3253c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f3254d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f3255e;

    /* renamed from: f, reason: collision with root package name */
    public final r0 f3256f;

    /* renamed from: z, reason: collision with root package name */
    public final c1 f3257z;

    public f(v vVar, b1 b1Var, m0 m0Var, d1 d1Var, q0 q0Var, r0 r0Var, c1 c1Var, s0 s0Var, w wVar, u0 u0Var, v0 v0Var, t0 t0Var) {
        this.f3251a = vVar;
        this.f3253c = m0Var;
        this.f3252b = b1Var;
        this.f3254d = d1Var;
        this.f3255e = q0Var;
        this.f3256f = r0Var;
        this.f3257z = c1Var;
        this.A = s0Var;
        this.B = wVar;
        this.C = u0Var;
        this.D = v0Var;
        this.E = t0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ce.f b(org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.f.b(org.json.JSONObject):ce.f");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return com.google.android.gms.common.internal.e0.l(this.f3251a, fVar.f3251a) && com.google.android.gms.common.internal.e0.l(this.f3252b, fVar.f3252b) && com.google.android.gms.common.internal.e0.l(this.f3253c, fVar.f3253c) && com.google.android.gms.common.internal.e0.l(this.f3254d, fVar.f3254d) && com.google.android.gms.common.internal.e0.l(this.f3255e, fVar.f3255e) && com.google.android.gms.common.internal.e0.l(this.f3256f, fVar.f3256f) && com.google.android.gms.common.internal.e0.l(this.f3257z, fVar.f3257z) && com.google.android.gms.common.internal.e0.l(this.A, fVar.A) && com.google.android.gms.common.internal.e0.l(this.B, fVar.B) && com.google.android.gms.common.internal.e0.l(this.C, fVar.C) && com.google.android.gms.common.internal.e0.l(this.D, fVar.D) && com.google.android.gms.common.internal.e0.l(this.E, fVar.E);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3251a, this.f3252b, this.f3253c, this.f3254d, this.f3255e, this.f3256f, this.f3257z, this.A, this.B, this.C, this.D, this.E});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3251a);
        String strValueOf2 = String.valueOf(this.f3252b);
        String strValueOf3 = String.valueOf(this.f3253c);
        String strValueOf4 = String.valueOf(this.f3254d);
        String strValueOf5 = String.valueOf(this.f3255e);
        String strValueOf6 = String.valueOf(this.f3256f);
        String strValueOf7 = String.valueOf(this.f3257z);
        String strValueOf8 = String.valueOf(this.A);
        String strValueOf9 = String.valueOf(this.B);
        String strValueOf10 = String.valueOf(this.C);
        String strValueOf11 = String.valueOf(this.D);
        StringBuilder sbM = m1.m("AuthenticationExtensions{\n fidoAppIdExtension=", strValueOf, ", \n cableAuthenticationExtension=", strValueOf2, ", \n userVerificationMethodExtension=");
        m1.s(sbM, strValueOf3, ", \n googleMultiAssertionExtension=", strValueOf4, ", \n googleSessionIdExtension=");
        m1.s(sbM, strValueOf5, ", \n googleSilentVerificationExtension=", strValueOf6, ", \n devicePublicKeyExtension=");
        m1.s(sbM, strValueOf7, ", \n googleTunnelServerIdExtension=", strValueOf8, ", \n googleThirdPartyPaymentExtension=");
        m1.s(sbM, strValueOf9, ", \n prfExtension=", strValueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return m6.a.j(sbM, strValueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 2, this.f3251a, i10, false);
        uk.c.b0(parcel, 3, this.f3252b, i10, false);
        uk.c.b0(parcel, 4, this.f3253c, i10, false);
        uk.c.b0(parcel, 5, this.f3254d, i10, false);
        uk.c.b0(parcel, 6, this.f3255e, i10, false);
        uk.c.b0(parcel, 7, this.f3256f, i10, false);
        uk.c.b0(parcel, 8, this.f3257z, i10, false);
        uk.c.b0(parcel, 9, this.A, i10, false);
        uk.c.b0(parcel, 10, this.B, i10, false);
        uk.c.b0(parcel, 11, this.C, i10, false);
        uk.c.b0(parcel, 12, this.D, i10, false);
        uk.c.b0(parcel, 13, this.E, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
