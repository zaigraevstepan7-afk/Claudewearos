package d4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import t.d0;
import t.s1;
import t.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements f1.a, s1 {

    /* renamed from: a, reason: collision with root package name */
    public int f4870a;

    /* renamed from: b, reason: collision with root package name */
    public int f4871b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4872c;

    public g(Context context) {
        this.f4871b = 0;
        this.f4872c = context;
    }

    @Override // f1.a
    public void c(int i10, Object obj) {
        ((f1.a) this.f4872c).c(i10 + (this.f4871b == 0 ? this.f4870a : 0), obj);
    }

    @Override // t.q1
    public t.p d(long j, t.p pVar, t.p pVar2, t.p pVar3) {
        return ((a8.j) this.f4872c).d(j, pVar, pVar2, pVar3);
    }

    @Override // f1.a
    public void e(Object obj) {
        this.f4871b++;
        ((f1.a) this.f4872c).e(obj);
    }

    @Override // f1.a
    public void f() {
        ((f1.a) this.f4872c).f();
    }

    @Override // f1.a
    public void g(int i10, int i11, int i12) {
        int i13 = this.f4871b == 0 ? this.f4870a : 0;
        ((f1.a) this.f4872c).g(i10 + i13, i11 + i13, i12);
    }

    @Override // f1.a
    public void h(int i10, int i11) {
        ((f1.a) this.f4872c).h(i10 + (this.f4871b == 0 ? this.f4870a : 0), i11);
    }

    @Override // f1.a
    public void i() {
        if (this.f4871b <= 0) {
            f1.n.a("OffsetApplier up called with no corresponding down");
        }
        this.f4871b--;
        ((f1.a) this.f4872c).i();
    }

    @Override // t.q1
    public t.p k(long j, t.p pVar, t.p pVar2, t.p pVar3) {
        return ((a8.j) this.f4872c).k(j, pVar, pVar2, pVar3);
    }

    @Override // f1.a
    public void l(int i10, Object obj) {
        ((f1.a) this.f4872c).l(i10 + (this.f4871b == 0 ? this.f4870a : 0), obj);
    }

    @Override // f1.a
    public Object n() {
        return ((f1.a) this.f4872c).n();
    }

    @Override // t.s1
    public int o() {
        return this.f4871b;
    }

    @Override // f1.a
    public void p(ej.e eVar, Object obj) {
        ((f1.a) this.f4872c).p(eVar, obj);
    }

    public synchronized int q() {
        PackageInfo packageInfoD;
        if (this.f4870a == 0) {
            try {
                packageInfoD = wd.b.a((Context) this.f4872c).d(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfoD = null;
            }
            if (packageInfoD != null) {
                this.f4870a = packageInfoD.versionCode;
            }
        }
        return this.f4870a;
    }

    public synchronized int r() {
        int i10 = this.f4871b;
        if (i10 != 0) {
            return i10;
        }
        Context context = (Context) this.f4872c;
        PackageManager packageManager = context.getPackageManager();
        if (wd.b.a(context).f9352a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.f4871b = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.f4871b = 2;
        return 2;
    }

    @Override // t.s1
    public int t() {
        return this.f4870a;
    }

    public g(View view) {
        this.f4872c = view;
    }

    public g(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f4872c = new ArrayList();
        this.f4871b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f4974h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f4870a = typedArrayObtainStyledAttributes.getResourceId(index, this.f4870a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4871b);
                this.f4871b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public g() {
        this.f4872c = new g[256];
        this.f4870a = 0;
        this.f4871b = 0;
    }

    public g(int i10, int i11) {
        this.f4872c = null;
        this.f4870a = i10;
        int i12 = i11 & 7;
        this.f4871b = i12 == 0 ? 8 : i12;
    }

    public g(f1.a aVar, int i10) {
        this.f4872c = aVar;
        this.f4870a = i10;
    }

    public g(int i10, int i11, ej.a aVar) {
        this.f4870a = i10;
        this.f4871b = i11;
        this.f4872c = aVar;
    }

    public g(int i10, int i11, w wVar) {
        this.f4870a = i10;
        this.f4871b = i11;
        this.f4872c = new a8.j(new d0(i10, i11, wVar));
    }
}
