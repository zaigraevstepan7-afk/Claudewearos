package w4;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.ArrayList;
import t4.d0;
import t4.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final e f18581a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18582b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public l4.b f18583c;

    /* renamed from: d, reason: collision with root package name */
    public l4.b f18584d;

    /* renamed from: e, reason: collision with root package name */
    public int f18585e;

    public g(ViewGroup viewGroup) {
        l4.b bVar = l4.b.f9966e;
        this.f18583c = bVar;
        this.f18584d = bVar;
        Drawable background = viewGroup.getBackground();
        this.f18585e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        e eVar = new e(this, viewGroup.getContext(), viewGroup);
        this.f18581a = eVar;
        eVar.setWillNotDraw(true);
        t1.f fVar = new t1.f(this, 2);
        Field field = l0.f15744a;
        d0.i(eVar, fVar);
        l0.n(eVar, new f(this));
        viewGroup.addView(eVar, 0);
    }
}
