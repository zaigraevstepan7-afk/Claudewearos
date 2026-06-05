package sa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;
import java.util.List;
import t6.t0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends t6.x {

    /* renamed from: d, reason: collision with root package name */
    public List f14887d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14888e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14889f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14890g;

    /* renamed from: h, reason: collision with root package name */
    public final xa.b f14891h;

    /* renamed from: i, reason: collision with root package name */
    public final ej.e f14892i;
    public final ej.c j;

    public k(List list, int i10, int i11, int i12, xa.b bVar, ej.e eVar, ej.c cVar) {
        fj.l.f(list, "apps");
        fj.l.f(eVar, "onAppClick");
        fj.l.f(cVar, "onAppLongClick");
        this.f14887d = list;
        this.f14888e = i10;
        this.f14889f = i11;
        this.f14890g = i12;
        this.f14891h = bVar;
        this.f14892i = eVar;
        this.j = cVar;
    }

    @Override // t6.x
    public final int a() {
        return this.f14887d.size();
    }

    @Override // t6.x
    public final void c(t0 t0Var, int i10) {
        j jVar = (j) t0Var;
        final xa.f fVar = (xa.f) this.f14887d.get(i10);
        View view = jVar.f16046a;
        fj.l.f(fVar, "app");
        ej.e eVar = this.f14892i;
        fj.l.f(eVar, "onAppClick");
        final ej.c cVar = this.j;
        fj.l.f(cVar, "onAppLongClick");
        ImageView imageView = jVar.f14879v;
        xa.d dVar = fVar.f19864c;
        imageView.setImageBitmap(dVar.f19855a);
        String str = dVar.f19856b;
        imageView.setContentDescription(str);
        TextView textView = jVar.f14880w;
        xa.b bVar = jVar.f14878u;
        fj.l.f(textView, "labelView");
        fj.l.f(str, "text");
        fj.l.f(bVar, "config");
        boolean z2 = bVar.f19852d;
        if (!z2) {
            str = "";
        }
        textView.setText(str);
        textView.setVisibility(z2 ? 0 : 8);
        view.setOnClickListener(new h(eVar, fVar, jVar, 0));
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: sa.i
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                cVar.invoke(Integer.valueOf(fVar.f19862a));
                return true;
            }
        });
    }

    @Override // t6.x
    public final t0 d(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_displayable_item, viewGroup, false);
        fj.l.c(viewInflate);
        return new j(viewInflate, this.f14888e, this.f14889f, this.f14890g, this.f14891h);
    }
}
