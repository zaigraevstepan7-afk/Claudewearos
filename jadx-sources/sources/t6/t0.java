package t6;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f16045t = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f16046a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f16047b;
    public int j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f16062r;

    /* renamed from: s, reason: collision with root package name */
    public x f16063s;

    /* renamed from: c, reason: collision with root package name */
    public int f16048c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f16049d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f16050e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f16051f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f16052g = -1;

    /* renamed from: h, reason: collision with root package name */
    public t0 f16053h = null;

    /* renamed from: i, reason: collision with root package name */
    public t0 f16054i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f16055k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f16056l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f16057m = 0;

    /* renamed from: n, reason: collision with root package name */
    public k0 f16058n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16059o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f16060p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f16061q = -1;

    public t0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f16046a = view;
    }

    public final void a(int i10) {
        this.j = i10 | this.j;
    }

    public final int b() {
        int i10 = this.f16052g;
        return i10 == -1 ? this.f16048c : i10;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.j & 1024) != 0 || (arrayList = this.f16055k) == null || arrayList.size() == 0) ? f16045t : this.f16056l;
    }

    public final boolean d() {
        View view = this.f16046a;
        return (view.getParent() == null || view.getParent() == this.f16062r) ? false : true;
    }

    public final boolean e() {
        return (this.j & 1) != 0;
    }

    public final boolean f() {
        return (this.j & 4) != 0;
    }

    public final boolean g() {
        if ((this.j & 16) != 0) {
            return false;
        }
        Field field = t4.l0.f15744a;
        return !this.f16046a.hasTransientState();
    }

    public final boolean h() {
        return (this.j & 8) != 0;
    }

    public final boolean i() {
        return this.f16058n != null;
    }

    public final boolean j() {
        return (this.j & 256) != 0;
    }

    public final boolean k() {
        return (this.j & 2) != 0;
    }

    public final void l(int i10, boolean z2) {
        if (this.f16049d == -1) {
            this.f16049d = this.f16048c;
        }
        if (this.f16052g == -1) {
            this.f16052g = this.f16048c;
        }
        if (z2) {
            this.f16052g += i10;
        }
        this.f16048c += i10;
        View view = this.f16046a;
        if (view.getLayoutParams() != null) {
            ((f0) view.getLayoutParams()).f15895c = true;
        }
    }

    public final void m() {
        this.j = 0;
        this.f16048c = -1;
        this.f16049d = -1;
        this.f16050e = -1L;
        this.f16052g = -1;
        this.f16057m = 0;
        this.f16053h = null;
        this.f16054i = null;
        ArrayList arrayList = this.f16055k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.f16060p = 0;
        this.f16061q = -1;
        RecyclerView.i(this);
    }

    public final void n(boolean z2) {
        int i10 = this.f16057m;
        int i11 = z2 ? i10 - 1 : i10 + 1;
        this.f16057m = i11;
        if (i11 < 0) {
            this.f16057m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && i11 == 1) {
            this.j |= 16;
        } else if (z2 && i11 == 0) {
            this.j &= -17;
        }
    }

    public final boolean o() {
        return (this.j & 128) != 0;
    }

    public final boolean p() {
        return (this.j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f16048c + " id=" + this.f16050e + ", oldPos=" + this.f16049d + ", pLpos:" + this.f16052g);
        if (i()) {
            sb2.append(" scrap ");
            sb2.append(this.f16059o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb2.append(" invalid");
        }
        if (!e()) {
            sb2.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb2.append(" update");
        }
        if (h()) {
            sb2.append(" removed");
        }
        if (o()) {
            sb2.append(" ignored");
        }
        if (j()) {
            sb2.append(" tmpDetached");
        }
        if (!g()) {
            sb2.append(" not recyclable(" + this.f16057m + ")");
        }
        if ((this.j & 512) != 0 || f()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f16046a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
