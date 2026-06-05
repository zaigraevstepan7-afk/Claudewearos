package m;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class w {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        t4.c eVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                eVar = new d8.e(clipData, 3);
            } else {
                t4.d dVar = new t4.d();
                dVar.f15712b = clipData;
                dVar.f15713c = 3;
                eVar = dVar;
            }
            t4.l0.h(textView, eVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th2) {
            textView.endBatchEdit();
            throw th2;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        t4.c eVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            eVar = new d8.e(clipData, 3);
        } else {
            t4.d dVar = new t4.d();
            dVar.f15712b = clipData;
            dVar.f15713c = 3;
            eVar = dVar;
        }
        t4.l0.h(view, eVar.build());
        return true;
    }
}
