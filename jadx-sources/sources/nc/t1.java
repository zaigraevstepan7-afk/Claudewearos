package nc;

import android.os.RemoteException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t1 implements fc.p {

    /* renamed from: a, reason: collision with root package name */
    public final String f12231a;

    /* renamed from: b, reason: collision with root package name */
    public final s1 f12232b;

    public t1(s1 s1Var) {
        String strZze;
        this.f12232b = s1Var;
        try {
            strZze = s1Var.zze();
        } catch (RemoteException e10) {
            rc.k.e("", e10);
            strZze = null;
        }
        this.f12231a = strZze;
    }

    public final String toString() {
        return this.f12231a;
    }
}
