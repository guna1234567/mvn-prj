package grp.view;

import org.linkki.framework.ui.component.Headline;

import com.vaadin.cdi.CDIView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;

import grp.page.apPage;

@CDIView(MainView.NAME)
public class MainView extends VerticalLayout implements View {

    public static final String NAME = "";

    private static final long serialVersionUID = 1L;

    public MainView() {
        addComponent(new Headline("linkki Example Web Application"));
        apPage page = new apPage();
        page.init();
        addComponent(page);

        setSizeFull();
        setExpandRatio(page, 1f);
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // TODO Auto-generated method stub
    }

}