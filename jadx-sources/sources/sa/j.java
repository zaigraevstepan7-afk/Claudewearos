package sa;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;
import t6.t0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends t0 {

    /* renamed from: u, reason: collision with root package name */
    public final xa.b f14878u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f14879v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f14880w;

    /* renamed from: x, reason: collision with root package name */
    public final View f14881x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View view, int i10, int i11, int i12, xa.b bVar) {
        super(view);
        fj.l.f(bVar, "appIconConfig");
        this.f14878u = bVar;
        View viewFindViewById = view.findViewById(R.id.app_icon_image);
        fj.l.e(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.f14879v = imageView;
        View viewFindViewById2 = view.findViewById(R.id.icon_label);
        fj.l.e(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.f14880w = textView;
        View viewFindViewById3 = view.findViewById(R.id.app_icon_selection_badge);
        fj.l.e(viewFindViewById3, "findViewById(...)");
        this.f14881x = viewFindViewById3;
        view.setLayoutParams(new t6.f0(-1, i11 + i12));
        xa.a.a(imageView, i10, bVar, null, null, 56);
        textView.setMaxLines(1);
        viewFindViewById3.setVisibility(8);
    }
}
