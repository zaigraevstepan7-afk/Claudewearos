package p0;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f12597a;

    /* renamed from: b, reason: collision with root package name */
    public final b f12598b;

    /* renamed from: c, reason: collision with root package name */
    public final b f12599c;

    /* renamed from: d, reason: collision with root package name */
    public final View f12600d;

    public e(f fVar, b bVar, b bVar2, View view) {
        this.f12597a = fVar;
        this.f12598b = bVar;
        this.f12599c = bVar2;
        this.f12600d = view;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final boolean a(Menu menu) {
        int i10;
        n0.c cVar = (n0.c) this.f12598b.a();
        int i11 = 0;
        if (fj.l.b(cVar, null)) {
            return false;
        }
        menu.clear();
        ?? r2 = cVar.f11842a;
        int size = r2.size();
        int i12 = 0;
        int i13 = 1;
        int i14 = 1;
        while (i12 < size) {
            n0.b bVar = (n0.b) r2.get(i12);
            if (bVar instanceof n0.d) {
                i10 = i13 + 1;
                Object obj = bVar.f11840a;
                final n0.d dVar = (n0.d) bVar;
                MenuItem menuItemAdd = menu.add(i14, fj.l.b(obj, n0.e.f11846a) ? R.id.cut : fj.l.b(obj, n0.e.f11847b) ? R.id.copy : fj.l.b(obj, n0.e.f11848c) ? R.id.paste : fj.l.b(obj, n0.e.f11849d) ? R.id.selectAll : fj.l.b(obj, n0.e.f11850e) ? R.id.autofill : i13, i13, dVar.f11843b);
                menuItemAdd.setShowAsAction(2);
                final int i15 = 0;
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: p0.d
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        switch (i15) {
                            case 0:
                                ((n0.d) dVar).f11845d.invoke(((e) this).f12597a);
                                break;
                            default:
                                Context context = (Context) dVar;
                                TextClassification textClassification = (TextClassification) this;
                                String text = textClassification.getText();
                                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                if (Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                    break;
                                } else {
                                    try {
                                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                        break;
                                    } catch (PendingIntent.CanceledException e10) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e10);
                                        return true;
                                    }
                                }
                        }
                        return true;
                    }
                });
            } else {
                if (bVar instanceof n0.h) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i10 = i13 + 1;
                        final Context context = this.f12600d.getContext();
                        n0.h hVar = (n0.h) bVar;
                        final TextClassification textClassification = hVar.f11852b;
                        int i16 = hVar.f11853c;
                        if (i16 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i13, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(textClassification.getIcon());
                            final int i17 = 1;
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: p0.d
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    switch (i17) {
                                        case 0:
                                            ((n0.d) context).f11845d.invoke(((e) textClassification).f12597a);
                                            break;
                                        default:
                                            Context context2 = (Context) context;
                                            TextClassification textClassification2 = (TextClassification) textClassification;
                                            String text = textClassification2.getText();
                                            PendingIntent activity = PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                            if (Build.VERSION.SDK_INT < 34) {
                                                activity.send();
                                                break;
                                            } else {
                                                try {
                                                    activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                                    break;
                                                } catch (PendingIntent.CanceledException e10) {
                                                    Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e10);
                                                    return true;
                                                }
                                            }
                                    }
                                    return true;
                                }
                            });
                        } else {
                            int i18 = i16 == 0 ? 1 : i11;
                            final RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i16);
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i18 != 0 ? 16908353 : i11, i13, remoteAction.getTitle());
                            menuItemAdd3.setShowAsAction(i18 == 0 ? 0 : 2);
                            if (i18 != 0 || remoteAction.shouldShowIcon()) {
                                menuItemAdd3.setIcon(remoteAction.getIcon().loadDrawable(context));
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: p0.q
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    PendingIntent actionIntent = remoteAction.getActionIntent();
                                    if (Build.VERSION.SDK_INT < 34) {
                                        actionIntent.send();
                                        return true;
                                    }
                                    try {
                                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e10) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e10);
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                } else if (bVar instanceof n0.f) {
                    i14++;
                }
                i12++;
                i11 = 0;
            }
            i13 = i10;
            i12++;
            i11 = 0;
        }
        return true;
    }
}
