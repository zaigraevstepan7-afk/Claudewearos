package ah;

import android.text.TextUtils;
import r5.p;
import r5.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g implements p {

    /* renamed from: a, reason: collision with root package name */
    public String f477a;

    @Override // r5.p
    public boolean d(CharSequence charSequence, int i10, int i11, x xVar) {
        if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f477a)) {
            return true;
        }
        xVar.f13772c = (xVar.f13772c & 3) | 4;
        return false;
    }

    @Override // r5.p
    public Object c() {
        return this;
    }
}
